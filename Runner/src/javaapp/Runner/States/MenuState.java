package javaapp.Runner.States;

import java.awt.Graphics;
import java.io.IOException;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Highscore;

/**
 * This class handles the menustate of the game
 * @Author Roman Melnik
 * @version 2018-03-01
 * 
 */

public class MenuState extends States {

	private States gameState;
	private States highscore;
	private int localtimer = 10000;

	
	/**
	 * 
	 * Constructor of the MenuState class.
	 * initiates new GameState
	 * The gameenigne object, game
	 * @param game
	 */
	public MenuState(Gameengine game) {
		super(game);
		gameState = new Gamestate(game);
		// highscore = new Highscore(game);
	}
	
	/**
	 * 
	 * Updates the parameters for different pressed buttons
	 * 
	 */

	@Override
	public void tick() {
		localtimer++;
		// button.getButton();
		if (game.getKeyManager().isPlay()) {
			States.setState(gameState);

		}

		if (game.getKeyManager().isQuit()) {
			System.exit(0);

		}

		if (game.getKeyManager().isHighscore() && localtimer > 10000) {
			try {
				Highscore.getHighscore();
				localtimer = 0;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/**
	 * 
	 * Draws the menu 
	 * graphics object g
	 *@param g
	 */
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.menu, (int) 0, (int) 0, null);

	}
}
