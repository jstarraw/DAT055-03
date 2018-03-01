package javaapp.Runner.Gameengine;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javaapp.Runner.States.MenuState;
import javaapp.Runner.States.States;

public class Gameengine implements Runnable {

	private Display display;
	private int width;
	private int height;
	private String title;

	private boolean running = false;
	private Thread thread;

	private BufferStrategy bs;
	private Graphics g;

	// States
	private States menuState;

	// Input
	private KeyAdmin keyAdmin;

	public Gameengine(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyAdmin = new KeyAdmin();
	}

	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyAdmin);
		Assets.init();

		menuState = new MenuState(this);

		States.setState(menuState);
	}

	private void tick() {
		keyAdmin.tick();

		if (States.getState() != null)
			States.getState().tick();
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here!

		if (States.getState() != null)
			States.getState().render(g);

		// End Drawing!
		bs.show();
		g.dispose();
	}

	public void run() {

		init();

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
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
