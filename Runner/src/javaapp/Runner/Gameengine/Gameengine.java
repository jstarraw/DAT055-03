package javaapp.Runner.Gameengine;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javaapp.Runner.States.MenuState;
import javaapp.Runner.States.States;

/**
 * This class is the core of the game. It handles the gameloop and takes care of the start and stop time of the game.
 * @Author Rickard Gyllensten
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
	 * Constructor for the class Gameengine
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
	 * Creates the display and initiates all images menustate sets menustate to
	 * actual state
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
	 * Tick updates parameters in the actual state Updates key-inputs
	 * 
	 */
	private void tick() {
		keyAdmin.tick();

		if (States.getState() != null)
			States.getState().tick();
	}

	/**
	 * 
	 * Renders actual state
	 * 
	 */

	private void render() {
		bufferstrat = display.getCanvas().getBufferStrategy();
		if (bufferstrat == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bufferstrat.getDrawGraphics();

		g.clearRect(0, 0, width, height);

		if (States.getState() != null)
			States.getState().render(g);

		bufferstrat.show();
		g.dispose();
	}

	/**
	 * 
	 * The gameloop, ticks 60 times per second and calls on tick and render
	 */
	public void run() {

		init();

		int framePerSec = 60;
		double timePerTick = 1000000000 / framePerSec;
		double diff = 0;
		long now;
		long lastTime = System.nanoTime();

		while (running) {
			now = System.nanoTime();
			diff += (now - lastTime) / timePerTick;
			lastTime = now;

			if (diff >= 1) {
				tick();
				render();

				diff--;
			}
		}

		stop();

	}

	/**
	 * 
	 * Returns the pressed key
	 * @return KeyAdmin
	 */

	public KeyAdmin getKeyManager() {
		return keyAdmin;
	}

	/**
	 * 
	 * When the game starts, the thread starts
	 */

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * 
	 * When the game ends the thread ends.
	 */

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
