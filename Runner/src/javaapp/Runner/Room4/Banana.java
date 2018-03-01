package javaapp.Runner.Room4;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * 
 * @author jenny
 * @version 2018-02-27
 *
 */

public class Banana {

	private float xPos;
	private float yPos;

	public int time = 200;

	public static boolean flagga1 = true;
	public static boolean flagga2 = true;
	public static boolean flagga3 = true;
	public static boolean flagga4 = true;
	public static boolean flagga5 = true;
	public static boolean flagga6 = true;
	public static boolean flagga7 = true;
	public static boolean flagga8 = true;
	public static boolean flagga9 = true;
	public static boolean flagga10 = true;
	public static boolean flagga11 = true;
	public static boolean flagga12 = true;
	public static boolean flagga13 = true;


	/**
	 * 
	 * @return x-position of the banana
	 */

/**
 * 
 * @return Returns the x-position of the banana
 */
	public float getxPos() {
		return xPos;
	}

	/**
	 * 
	 * @param xPos
	 */
	public void setxPos(float xPos) {
		this.xPos = xPos;
	}


	/**
	 * 
	 * @return y-postion for banana
	 */

	public float getyPos() {
		return yPos;
	}

	/**
	 * 
	 * @param yPos
	 */
	public void setyPos(float yPos) {
		this.yPos = yPos;
	}

	/**
	 * Removes the candies if the player is within specific boundery
	 * 
	 * @param
	 * 
	 * 
	 */
	public void tick() {
		time++;

		if (Player.getXPos() > 355 && Player.getXPos() < 400 && Player.getYPos() > 170 && Player.getYPos() < 200
				&& time > 200)
			flagga1 = false;
		if (Player.getXPos() > 200 && Player.getXPos() < 245 && Player.getYPos() > 295 && Player.getYPos() < 325
				&& time > 299)
			flagga2 = false;
		if (Player.getXPos() > 100 && Player.getXPos() < 130 && Player.getYPos() > 515 && Player.getYPos() < 525
				&& time > 200)
			flagga3 = false;
		if (Player.getXPos() > 250 && Player.getXPos() < 285 && Player.getYPos() > 595 && Player.getYPos() < 625
				&& time > 200)
			flagga4 = false;
		if (Player.getXPos() > 645 && Player.getXPos() < 690 && Player.getYPos() > 320 && Player.getYPos() < 350
				&& time > 200)
			flagga5 = false;
		if (Player.getXPos() > 656 && Player.getXPos() < 710 && Player.getYPos() > 220 && Player.getYPos() < 240
				&& time > 200)
			flagga6 = false;
		if (Player.getXPos() > 410 && Player.getXPos() < 435 && Player.getYPos() > 560 && Player.getYPos() < 600
				&& time > 200)
			flagga7 = false;
		if (Player.getXPos() > 295 && Player.getXPos() < 340 && Player.getYPos() > 270 && Player.getYPos() < 300
				&& time > 200)
			flagga8 = false;
		if (Player.getXPos() > 225 && Player.getXPos() < 270 && Player.getYPos() > 170 && Player.getYPos() < 200
				&& time > 200)
			flagga9 = false;
		if (Player.getXPos() > 150 && Player.getXPos() < 210 && Player.getYPos() > 450 && Player.getYPos() < 480
				&& time > 200)
			flagga10 = false;
		if (Player.getXPos() > 400 && Player.getXPos() < 440 && Player.getYPos() > 420 && Player.getYPos() < 450
				&& time > 200)
			flagga11 = false;
		if (Player.getXPos() > 455 && Player.getXPos() < 500 && Player.getYPos() > 450 && Player.getYPos() < 480
				&& time > 200)
			flagga12 = false;
		if (Player.getXPos() > 660 && Player.getXPos() < 700 && Player.getYPos() > 510 && Player.getYPos() < 540
				&& time > 200)
			flagga13 = false;
	}

	/**
	 * 
	 * This method draws candy if the flags are set to true
	 * 
	 * @param g
	 */
	public void render(Graphics g) {

		// Remove 25 pixels, add 20 pixels, remove 30 pixels, keep the value
		// if not vurly brackets the banan wont be shown after
		if (flagga1) {
			g.drawImage(Assets.banana, (int) 380, (int) 200, null);
		}
		if (flagga2) {
			g.drawImage(Assets.icecream, (int) 225, (int) 325, null);
		}
		if (flagga3) {
			g.drawImage(Assets.icecream2, (int) 125, (int) 525, null);
		}
		if (flagga4) {
			g.drawImage(Assets.chocolate, (int) 275, (int) 625, null);
		}
		if (flagga5) {
			g.drawImage(Assets.candyKane, (int) 670, (int) 350, null);
		}
		if (flagga6) {
			g.drawImage(Assets.banana, (int) 690, (int) 240, null);
		}
		if (flagga7) {
			g.drawImage(Assets.banana, (int) 435, (int) 590, null);
		}
		if (flagga8) {
			g.drawImage(Assets.banana, (int) 320, (int) 300, null);
		}
		if (flagga9) {
			g.drawImage(Assets.banana, (int) 250, (int) 200, null);
		}
		if (flagga10) {
			g.drawImage(Assets.banana, (int) 180, (int) 480, null);
		}
		if (flagga11) {
			g.drawImage(Assets.banana, (int) 420, (int) 450, null);
		}
		if (flagga12) {
			g.drawImage(Assets.icecream, (int) 480, (int) 480, null);
		}
		if (flagga13) {
			g.drawImage(Assets.icecream2, (int) 685, (int) 540, null);
		}

	}

}