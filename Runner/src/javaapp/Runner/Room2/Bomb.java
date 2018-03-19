package javaapp.Runner.Room2;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * This class creates the bomb for that is initialized in RoomState2
 * @Author Daniel Cebe
 * @version 2018-03-01
 * 
 */

public class Bomb {

	private float x;
	private float y;
	private boolean flagg;
	private float direction = 1, speed;
	
	
	/**
	 * Constructor for the class Bomb that creates the bomb with given x and y and speed
	 * @param x any float, y any float, speed
	 * 
	 */
	
	public Bomb(float x, float y, float speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;

	}

	/**
	 * Updates the parameters for the bomb
	 * 
	 */
	public void tick() {
		collisionDetect();
		BallsDirection();

	}

	/** 
	 * Method that keeps track of the speed of the bomb
	 * The bomb moves downwards, then we have positive speed
	 * The bomb moves upwards, then we have a negative speed
	 * 
	 */
	
	public void BallsDirection() {

		if (y > 600)
			direction = -speed;
		if (y < 100)
			direction = speed;

		y += direction;

	}

	/**
	 * Detects if the player have a collision with the bomb When a collision occurs
	 * with the bomb, player starts from a given x and y pos
	 *
	 */

	public void collisionDetect() {

		if (x + 60 > Player.getXPos() && x < Player.getXPos() + 25) {
			if (y + 60 > Player.getYPos() && y < Player.getYPos()) {
				flagg = true;

				Player.setYPos(550);
				Player.setXPos(10);

			}
		}
	}

	/**
	 * Draws a bomb to the room with a given x and y position
	 * graphics object g
	 * @param g
	 */

	public void render(Graphics g) {

		g.drawImage(Assets.bomb1, (int) x, (int) y, null);

	}

}
