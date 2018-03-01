package javaapp.Runner.Room2;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

/**
 * @Author Daniel Cebe
 * @version 2018-03-01
 * 
 */

public class Candle {

	private int x;
	private int y;
	private boolean lit = true;
	
	
/**
* @Author Daniel Cebe
* @version 2018-03-01
* 
*/

	public Candle(int x, int y) {
		this.x = x;
		this.y = y;

	}
	


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
	 * @param lit
	 * Sets the lit-flag to true for the candles
	 * 
	 */

	public void setLit(boolean lit) {
		this.lit = lit;
	}

	
	
	
	public boolean getFlag() {

		return !lit;
	}

	
	
/**
* @param g
* render picture of the light candles if the flag is true
* otherwise it renders the picture of the candle with closed light.  
* 
*/	
	public void render(Graphics g) {

		if (lit)
			g.drawImage(Assets.stearin, (int) x, (int) y, null);

		else
			g.drawImage(Assets.stearin1, (int) x, (int) y, null);

	}

}
