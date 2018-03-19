package javaapp.Runner.Gameengine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * This class handles the keymanagements, like inputs from the keyboard.
 * @Author Rickard Gyllensten
 * @version 2018-03-01
 * 
 */

public class KeyAdmin implements KeyListener {

	private boolean[] keys;
	private boolean up, down, left, right, interact, Esc, quit, play, highscore;

	/**
	 * Constructor of the class KeyAdmin
	 * Creates an array of booleans
	 */
	
	public KeyAdmin() {
		keys = new boolean[256];
	}

	
	/**
	 * Updates the parameters for the keys
	 * 
	 */
	
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
	 * returns the up key (W)
	 * @return the up
	 */
	public boolean isUp() {
		return up;
	}

	/**
	 * returns the down key (s)
	 * @return the down
	 */
	public boolean isDown() {
		return down;
	}

	/**
	 * returns the left movement key (a)
	 * @return the left
	 */
	public boolean isLeft() {
		return left;
	}

	/**
	 * returns the right key (d)
	 * @return the right
	 */
	public boolean isRight() {
		return right;
	}

	
	/**
	 * 
	 * The key for quit the game (q)
	 * @return the quit
	 */
	public boolean isQuit() {
		return quit;
	}

	/**
	 * 
	 * The key for play button (p)
	 * @return play
	 */
	public boolean isPlay() {
		return play;
	}
	
	
	/**
	 * 
	 * returns the key for reach the highscore table
	 * @return highscore
	 */

	public boolean isHighscore() {
		return highscore;
	}
	
	/**
	 * 
	 * They key Esc, returns you to the menuState
	 * @return Esc
	 */

	public boolean isEsc() {
		return Esc;
	}

	/**
	 * Returns the interact key, E
	 * @return the interact
	 */
	public boolean isInteract() {
		return interact;
	}

	
	/**
	 * 
	 * Method that looks if the key is pressed
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	
	/**
	 * 
	 * Method that looks if the key is released
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	
	/**
	 * 
	 * method that overrides keylistener interface
	 * Invoked when a key has been typed.
	 */
	@Override
	public void keyTyped(KeyEvent e) {

	}

}