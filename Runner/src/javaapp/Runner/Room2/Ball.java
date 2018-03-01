package javaapp.Runner.Room2;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * @Author Daniel Cebe
 * @version 2018-03-01
 * 
 */

public class Ball {
	private float x;
	float y;
	private boolean flagg;
	private float direction = 1, speed;

	public Ball(float x, float y, float speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;

	}

	/**
	 * Metoden tickar
	 * 
	 */
	public void tick() {
		collisionDetect();
		atBallsDirection();

	}

	public void atBallsDirection() {

		if (y > 600)
			direction = -speed;
		if (y < 100)
			direction = speed;

		y += direction;

	}

	/**
	 * Detects if the player have a collision with the ball When a collision occurs
	 * with the ball, player starts from a given x and y pos
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
	 * 
	 * @param g
	 */

	public void render(Graphics g) {

		g.drawImage(Assets.bomb1, (int) x, (int) y, null);

	}

}
