package javaapp.Runner.Gameengine;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javaapp.Runner.States.MenuState;
import javaapp.Runner.States.States;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */

public class Gameengine implements Runnable {

	private Display display;
	private int width;
	private int height;
	private String title;
	private boolean running = false;
	private Thread thread;
	private BufferStrategy bufferstrat;
	private Graphics g;
	private States menuState;
	private KeyAdmin keyAdmin;

	/**
	 * Konstruktor för klassen gameengine.
	 * 
	 * @param title,
	 *            width any integer, height any integer
	 */
	public Gameengine(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyAdmin = new KeyAdmin();
	}

	
	/**
	 * 
	 * @param Skapar displayen inititerar alla bilder och menustaten sätter menustate till aktuell state.
	 * 
	 * 
	 */
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyAdmin);
		Assets.init();

		menuState = new MenuState(this);

		States.setState(menuState);
	}

	/**
	 * 
	 * tick uppdaterar parametrar i aktuell state 
	 * uppdaterar även tangenttryck
	 */
	private void tick() {
		keyAdmin.tick();

		if (States.getState() != null)
			States.getState().tick();
	}

	private void render() {
		bufferstrat = display.getCanvas().getBufferStrategy();
		if (bufferstrat == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bufferstrat.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here!

		if (States.getState() != null)
			States.getState().render(g);

		// End Drawing!
		bufferstrat.show();
		g.dispose();
	}

	public void run() {

		init();

		int framePerSec = 60;
		double timePerTick = 1000000000 / framePerSec;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();

				delta--;
			}
		}

		stop();

	}

	public KeyAdmin getKeyManager() {
		return keyAdmin;
	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
