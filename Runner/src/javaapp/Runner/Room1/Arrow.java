package javaapp.Runner.Room1;

import java.awt.Graphics;
import java.util.Random;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

public class Arrow {

	private boolean brokenflag = false, dead = false;
	Random rand = new Random();
	private int x = rand.nextInt(700) + 10;
	private int y = rand.nextInt(3000) + 700;
	private int timer = 0;

	public Arrow() {

	}
	/**
	 * updates parameters for the arrow.
	 */
	public void tick() {

		arrowCalc();
		arrowHit();

	}
	/**
	 * Renders the arrow. dead or alive
	 * @param g
	 */
	public void render(Graphics g) {
		if (!brokenflag)
			g.drawImage(Assets.arrow, (int) x, (int) y, null);
		else
			g.drawImage(Assets.brokenarrow, (int) x, (int) y, null);

	}
	/**
	 *  Checks if arrow is alive. Updates arrow parameters.
	 */
	public void arrowCalc() {

		if (!dead){
			if (y < 120) {
				brokenflag = true;
			}
			if (brokenflag){
				x++;
				y++;

				if (y > rand.nextInt(70) + 160) {
					dead = true;
				}
			}
			else {
				y -= 6;
			}
		}
		else {
			timer++;
			if (timer > 40) {
				resetArrow();
			}
		}

	}
	/**
	 * Collisioncheck and if that is the case it moves the player and resets arrow
	 */
	public void arrowHit() {

		if (!brokenflag) {
			if (y < Player.getYPos() + 25 && x < Player.getXPos() + 40 && x > Player.getXPos()) {
				Player.setYPos(650);
				Player.setXPos(300);
				resetArrow();
			}
		}

	}
/**
 * resets arrow and flags. The arrow gets a new position
 */
	public void resetArrow() {
		y = rand.nextInt(10000) + 700;
		x = rand.nextInt(700) + 10;
		dead = false;
		brokenflag = false;
		timer = 0;
	}
}
