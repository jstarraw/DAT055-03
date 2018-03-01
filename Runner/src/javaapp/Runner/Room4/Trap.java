package javaapp.Runner.Room4;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * 
 * @author jenny
 * @version 2018-02-27
 */
public class Trap {

	private float posX, posY;

	/**
	 * This methods restarts the player from the rooms beginning when selected
	 * bounderies are hit.
	 */
	public void tick() {

		if (Player.getXPos() > 430 && Player.getXPos() < 480 && Player.getYPos() > 530 && Player.getYPos() < 580)
			restartPlayer();
		if (Player.getXPos() > 250 && Player.getXPos() < 300 && Player.getYPos() > 370 && Player.getYPos() < 400)
			restartPlayer();
		if (Player.getXPos() > 450 && Player.getXPos() < 500 && Player.getYPos() > 250 && Player.getYPos() < 300)
			restartPlayer();
		if (Player.getXPos() > 550 && Player.getXPos() < 600 && Player.getYPos() > 550 && Player.getYPos() < 600)
			restartPlayer();
		if (Player.getXPos() > 230 && Player.getXPos() < 280 && Player.getYPos() > 450 && Player.getYPos() < 500)
			restartPlayer();
		if (Player.getXPos() > 130 && Player.getXPos() < 180 && Player.getYPos() > 550 && Player.getYPos() < 600)
			restartPlayer();
		if (Player.getXPos() > 550 && Player.getXPos() < 600 && Player.getYPos() > 450 && Player.getYPos() < 500)
			restartPlayer();
		if (Player.getXPos() > 130 && Player.getXPos() < 170 && Player.getYPos() > 275 && Player.getYPos() < 325)
			restartPlayer();
		if (Player.getXPos() > 90 && Player.getXPos() < 130 && Player.getYPos() > 140 && Player.getYPos() < 190)
			restartPlayer();
		if (Player.getXPos() > 640 && Player.getXPos() < 690 && Player.getYPos() > 150 && Player.getYPos() < 180)
			restartPlayer();
		if (Player.getXPos() > 380 && Player.getXPos() < 420 && Player.getYPos() > 350 && Player.getYPos() < 390)
			restartPlayer();
		if (Player.getXPos() > 80 && Player.getXPos() < 105 && Player.getYPos() > 450 && Player.getYPos() < 490)
			restartPlayer();
		if (Player.getXPos() > 290 && Player.getXPos() < 315 && Player.getYPos() > 170 && Player.getYPos() < 210)
			restartPlayer();
		if (Player.getXPos() > 450 && Player.getXPos() < 490 && Player.getYPos() > 170 && Player.getYPos() < 210)
			restartPlayer();
	}

	// Remove 50 pixels, keep the value, remove 50 pixels, keep the value
	/**
	 * Draws the traps.
	 * 
	 * @param g
	 */
	public void render(Graphics g) {

		g.drawImage(Assets.trap, (int) 480, (int) 580, null);
		g.drawImage(Assets.trap, (int) 300, (int) 400, null);
		g.drawImage(Assets.trap, (int) 500, (int) 300, null);
		g.drawImage(Assets.trap, (int) 600, (int) 600, null);
		g.drawImage(Assets.trap, (int) 280, (int) 500, null);
		g.drawImage(Assets.trap, (int) 180, (int) 600, null);
		g.drawImage(Assets.trap, (int) 600, (int) 500, null);
		g.drawImage(Assets.trap, (int) 170, (int) 325, null);
		g.drawImage(Assets.trap, (int) 130, (int) 190, null);
		g.drawImage(Assets.trap, (int) 690, (int) 200, null);
		g.drawImage(Assets.trap, (int) 420, (int) 390, null);
		g.drawImage(Assets.trap, (int) 105, (int) 490, null);
		g.drawImage(Assets.trap, (int) 315, (int) 220, null);
		g.drawImage(Assets.trap, (int) 490, (int) 210, null);

	}

	/**
	 * Restarts the player from its start position and sets the flags to true
	 */
	public void restartPlayer() {
		setPlayer();
		setBananaFlags();
	}

	public void setPlayer() {
		Player.setXPos(650);
		Player.setYPos(300);
	}

	/**
	 * Sets all the banana flags to true
	 */
	public void setBananaFlags() {

		Banana.flagga1 = true;
		Banana.flagga2 = true;
		Banana.flagga3 = true;
		Banana.flagga4 = true;
		Banana.flagga5 = true;
		Banana.flagga6 = true;
		Banana.flagga7 = true;
		Banana.flagga8 = true;
		Banana.flagga9 = true;
		Banana.flagga10 = true;
		Banana.flagga11 = true;
		Banana.flagga12 = true;
		Banana.flagga13 = true;

	}

<<<<<<< HEAD
	/**
	 * Gets the x -position for the trap
	 * 
	 */
=======
/**
 * @return the x position of the player
 * 
 */
>>>>>>> bab6e5e9af60b4e4189f09c9fea73dc4bc4e930b
	public float getPosX() {
		return posX;
	}

	/**
	 * Sets the x position for the trap
	 * 
	 * @param posX
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}
<<<<<<< HEAD

	/**
	 * 
	 * @return the y position for the trap
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * Sets the y-position for the trap
	 * 
	 * @param posY
	 */
=======
	
/**
 * 
 * @return Returns the y position of the trap
 */
	public float getPosY() {
		return posY;
	}
/**
 * Sets the y-position of the trap
 * @param posY 
 */
>>>>>>> bab6e5e9af60b4e4189f09c9fea73dc4bc4e930b
	public void setPosY(float posY) {
		this.posY = posY;
	}
}