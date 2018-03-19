package javaapp.Runner.Room2;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

/**
 * This class handles the candles that is used in RoomState2
 * @Author Daniel Cebe
 * @version 2018-03-01
 * 
 */

public class Candle {

	private int x;
	private int y;
	private boolean lit = true;
	
	

	/**
	 * 
	 * The constructor of the class candle
	 * position x and position y
	 * @param x, y 
	 */
	
	public Candle(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	/**
	 * Updates the parameters for the candles
	 * 
	 */

	public void tick() {

		collisionDetect();

	}
	
	
	/**
	 * Detects if the player have a collision with the candle 
	 * When a collision occurs, close the candle light
	 * 
	 *
	 */

	public void collisionDetect() {

		if (x + 60 > Player.getXPos() && x < Player.getXPos() + 25) {
			if (y + 65 > Player.getYPos() && y < Player.getYPos()) {

				lit = false;
			}

		}
	}
	
	/**
	 * 
	 * Sets the lit-flag to true for the candles
	 * the variable for the flag lit
	 * @param lit
	 * 
	 * 
	 */

	public void setLit(boolean lit) {
		this.lit = lit;
	}

	
	/**
	 * 
	 *Get the flag for the candles
	 *@Return the inverse lit-flag which is true and becomes false.   
	 * 
	 *
	 */
	
	public boolean getFlag() {

		return !lit;
	}

	
	
	/**
 	* 
 	* otherwise it renders the picture of the candle with closed light. 
 	* Draws picture of the light candles if the flag is true
 	* graphics object g,
 	* @param g 
 	*
 	*/	
	public void render(Graphics g) {

		if (lit)
			g.drawImage(Assets.stearin, (int) x, (int) y, null);

		else
			g.drawImage(Assets.stearin1, (int) x, (int) y, null);

	}

}
