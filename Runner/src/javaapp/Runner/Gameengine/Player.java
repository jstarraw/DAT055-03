package javaapp.Runner.Gameengine;

import java.awt.Graphics;

/**
 * This class creates and handles the player, everything from positions to speed.
 * @Author Rickard Gyllensten
 * @version 2018-03-01
 * 
 */

public class Player {

	private Gameengine game;
	private int a;
	private static float x, y;
	
	/**
	 * 
	 * Constructor for the Player class
	 * takes three parameters, the gameengine object, any float x, any float y.
	 * 
	 * @param game, the gameenigne object, game
	 * @param x, x position for the player
	 * @param y , y position for the player
	 */

	public Player(Gameengine game, float x, float y) {
		this.x = x;
		this.y = y;
		// super(x, y);
		this.game = game;
	}

	
	/**
	 * returns the players y-position
	 * 
	 * @return y
	 */
	public static float getYPos() {
		return y;
	}
	
	/**
	 * Returns the players x-position
	 * 
	 * @return x
	 */

	public static float getXPos() {
		return x;
	}
	
	
	/** 
	 * Takes a parameter and sets the player's y-position
	 * new position for y, parameter temp
	 * @param temp
	 */

	public static void setYPos(float temp) {
		y = temp;
	}
	
	
	/**
	 * 
	 * Takes a parameter and sets the player's X-position
	 * new position x, parameter temp
	 * @param temp
	 */

	public static void setXPos(float temp) {
		x = temp;
	}

	
	/**
	 * 
	 * Updates the pressed buttons and player position
	 */
	
	public void tick() {
		if (game.getKeyManager().isUp()) {
			a = 0;
			if (y > 115)
				y -= 4;
		}
		if (game.getKeyManager().isDown()) {
			a = 1;
			if (y < 635)
				y += 4;
		}
		if (game.getKeyManager().isLeft()) {
			a = 2;
			if (x > 10)
				x -= 4;
		}
		if (game.getKeyManager().isRight()) {
			a = 3;
			if (x < 770)
				x += 4;
		}

	}
	
	
	/**
	 * 
	 * Draws the player in four different angles
	 * Draws the banner so that the area is limited for the player
	 * graphics object g
	 * @param g
	 */

	public void render(Graphics g) {
		if (a == 0) {
			g.drawImage(Assets.player2, (int) x, (int) y, null);
		}
		if (a == 1) {
			g.drawImage(Assets.player, (int) x, (int) y, null);
		}
		if (a == 2) {
			g.drawImage(Assets.player3, (int) x, (int) y, null);
		}
		if (a == 3) {
			g.drawImage(Assets.player4, (int) x, (int) y, null);
		}
		g.drawImage(Assets.banner1, (int) 0, (int) 645, null);

	}
}
