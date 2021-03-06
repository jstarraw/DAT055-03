package javaapp.Runner.Room1;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * This class handles the buttons and the torches in the game
 * @Author Rickard Gyllensten
 * @version 2018-03-01
 * 
 */

public class Buttons {

	private static boolean flagga1 = false, flagga2 = false, flagga3 = false, flagga4 = false, flagga5 = false,
			flagga6 = false, flagga7 = false, flagga8;
	private static int timer = 200, timer2 = 0;
	private static int i;

	/**
	 * Updates parameters on buttons. 
	 */
	public void tick() {

		pushButton();

	}
/**
 * 	Renders buttons.
 * The graphics object g
 * @param g
 */
	public void render(Graphics g) {
		renderButton(g);
	}
/**
 * checks of we have set the right flags to enter next part of the game.
 * @return
 * 		returns true if we set the right flags. Otherwise false.
 */
	public boolean checkFlags() {

		if (flagga2 && flagga5 && flagga6 && flagga7) {
			if (!flagga1 && !flagga3 && !flagga4 && !flagga8)
				return true;
		} else
			return false;

		return false;
	}
/**
 *  checks the y cordinate if we are close to button. In that case calls atButton()
 */
	public void pushButton() {
		if (Player.getYPos() < 130) {
			timer++;
			atButton(Player.getXPos());
		}

	}
	/**
	 * Check if player is at button
	 * 
	 *
	 * @param x
	 * 	x is the players x cordinate.
	 */
	public void atButton(float x) {
		if (timer > 15) {
			if (x > 20 && x < 90) {
				flagga1 = !flagga1;
				timer = 0;
			}

			if (x > 100 && x < 160) {
				flagga2 = !flagga2;
				timer = 0;
			}
			if (x > 180 && x < 230) {
				flagga3 = !flagga3;
				timer = 0;
			}
			if (x > 250 && x < 310) {
				flagga4 = !flagga4;
				timer = 0;
			}
			if (x > 405 && x < 480) {
				flagga5 = !flagga5;
				timer = 0;
			}
			if (x > 500 && x < 550) {
				flagga6 = !flagga6;
				timer = 0;
			}
			if (x > 570 && x < 650) {
				flagga7 = !flagga7;
				timer = 0;
			}
			if (x > 660 && x < 720) {
				flagga8 = !flagga8;
				timer = 0;
			}
		}

	}
/**
 *  renders the button and fire
 *  graphics object g,
 * @param g Graphics
 */
	public void renderButton(Graphics g) {
		if (flagga1)
			renderFire(g, 60);
		else
			g.drawImage(Assets.NoFire, (int) 60, (int) 65, null);

		if (flagga2)
			renderFire(g, 140);
		else
			g.drawImage(Assets.NoFire, (int) 140, (int) 65, null);
		if (flagga3)
			renderFire(g, 220);
		else
			g.drawImage(Assets.NoFire, (int) 220, (int) 65, null);
		if (flagga4)
			renderFire(g, 300);
		else
			g.drawImage(Assets.NoFire, (int) 300, (int) 65, null);
		if (flagga5)
			renderFire(g, 460);
		else
			g.drawImage(Assets.NoFire, (int) 460, (int) 65, null);
		if (flagga6)
			renderFire(g, 540);
		else
			g.drawImage(Assets.NoFire, (int) 540, (int) 65, null);
		if (flagga7)
			renderFire(g, 620);
		else
			g.drawImage(Assets.NoFire, (int) 620, (int) 65, null);
		if (flagga8)
			renderFire(g, 700);
		else
			g.drawImage(Assets.NoFire, (int) 700, (int) 65, null);

	}

	/**
	 * Renders fire and animates it to make it more real.
	 * 
	 * @param g
	 *            the graphic object g.
	 * @param x
	 *            Position of fireRender
	 */
	public void renderFire(Graphics g, int x) {

		timer2++;
		if (timer2 > 15) {
			i++;
			timer2 = 0;
		}
		if (i > 4)
			i = 0;

		g.drawImage(Assets.FireArray[i], (int) x, (int) 65, null);

	}

}
