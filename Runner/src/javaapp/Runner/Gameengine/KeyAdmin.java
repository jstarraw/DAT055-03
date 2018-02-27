package javaapp.Runner.Gameengine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAdmin implements KeyListener {

	private boolean[] keys;
	private boolean up, down, left, right, interact, Esc, quit, play, highscore;

	public KeyAdmin() {
		keys = new boolean[256];
	}

	public void tick() {
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		interact = keys[KeyEvent.VK_E];
		play = keys[KeyEvent.VK_P];
		quit = keys[KeyEvent.VK_Q];
		highscore = keys[KeyEvent.VK_S];
		Esc = keys[KeyEvent.VK_ESCAPE];

	}

	/**
	 * @return the up
	 */
	public boolean isUp() {
		return up;
	}

	/**
	 * @return the down
	 */
	public boolean isDown() {
		return down;
	}

	/**
	 * @return the left
	 */
	public boolean isLeft() {
		return left;
	}

	/**
	 * @return the right
	 */
	public boolean isRight() {
		return right;
	}

	public boolean isQuit() {
		return quit;
	}

	public boolean isPlay() {
		return play;
	}

	public boolean isHighscore() {
		return highscore;
	}

	public boolean isEsc() {
		return Esc;
	}

	/**
	 * @return the interact
	 */
	public boolean isInteract() {
		return interact;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}