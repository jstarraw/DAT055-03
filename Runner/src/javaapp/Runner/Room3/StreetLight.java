package javaapp.Runner.Room3;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

/**
 * 
 * @author nurabd
 * @version 2018-03-01
 *
 */
public class StreetLight {

	private static int timer = 50;
	private boolean way1to2 = false;
	private boolean way1to5 = false;
	private boolean way2to3 = false;
	private boolean way2to4 = false;
	private boolean way3to7 = false;
	private boolean way6to7 = false;
	private boolean way4to6 = false;
	private boolean way5to6 = false;

	/**
	 * will draw if the player is settled in a platform which is connected to two or
	 * more ways.
	 */
	public void tick() {
		timer++;

		platforms();
		helpMetods();
		turnOnAll();
		TurnoffAll();

	}

	/**
	 * 
	 * @param g
	 *            is a graphic object which will draw the wanted object that will be
	 *            drawn. the boolean will indicate which item is going to be drawn , 
	 *            it takes order from tick
	 */
	public void render(Graphics g) {

		// upp horiszontellt ----- vänster
		if (way1to2) {
			g.drawImage(Assets.streetlight, (int) 120, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 170, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 220, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 270, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 320, (int) 275 - 2, null);

		}
		// upp horiszontellt ----- höger
		if (way2to3) {
			g.drawImage(Assets.streetlight, (int) 490, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 540, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 590, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 640, (int) 272, null);
		}
		//
		// // ner horisontelt ---- vänster
		if (way5to6) {
			g.drawImage(Assets.streetlight, (int) 120, (int) 600, null);
			g.drawImage(Assets.streetlight, (int) 170, (int) 600, null);
			g.drawImage(Assets.streetlight, (int) 220, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 270, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320, (int) 598, null);
		}
		// ner horisontelt ---- höger
		if (way6to7) {
			g.drawImage(Assets.streetlight, (int) 490, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 540, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320 + 270, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 270 + 270 + 50, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320 + 270 + 50, (int) 598, null);
		}

		// // vänster
		if (way1to5) {
			g.drawImage(Assets.streetlight, (int) 40, (int) 320 + 10, null);
			g.drawImage(Assets.streetlight, (int) 40, (int) 370 + 10, null);
			g.drawImage(Assets.streetlight, (int) 40, (int) 420 + 10, null);
			g.drawImage(Assets.streetlight, (int) 40, (int) 470 + 10, null);
			g.drawImage(Assets.streetlight, (int) 40, (int) 520 + 10, null);

		}
		// // höger
		if (way3to7) {
			g.drawImage(Assets.streetlight, (int) 750, (int) 350 - 10, null);
			g.drawImage(Assets.streetlight, (int) 750, (int) 400 - 10, null);
			g.drawImage(Assets.streetlight, (int) 750, (int) 450 - 10, null);
			g.drawImage(Assets.streetlight, (int) 750, (int) 500 - 10, null);
			g.drawImage(Assets.streetlight, (int) 750, (int) 550 - 10, null);

		}
		//
		// mitten
		if (way2to4) {
			g.drawImage(Assets.streetlight, (int) 410, (int) 335, null);
			g.drawImage(Assets.streetlight, (int) 410, (int) 380, null);

		}

		if (way4to6) {
			g.drawImage(Assets.streetlight, (int) 410, (int) 480 + 8, null);
			g.drawImage(Assets.streetlight, (int) 410, (int) 530 + 3, null);

		}

	}

	
	/**
	 * the platform are the place where the player is turning on the lamps
	 * the boolean indicate if the player is that place there there is plattforms ,
	 * if yes the ways will be drawn
	 */
	public void platforms() {

		boolean platform1 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 10
				&& Player.getXPos() < 100 && timer > 50;
		boolean platform2 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 370
				&& Player.getXPos() < 450 && timer > 50;
		boolean platform3 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 680
				&& Player.getXPos() < 780 && timer > 50;
		boolean platform4 = Player.getYPos() < 620 && Player.getYPos() > 573 && Player.getXPos() > 704
				&& Player.getXPos() < 770 && timer > 50;
		boolean platform5 = Player.getYPos() < 456 && Player.getYPos() > 411 && Player.getXPos() > 383
				&& Player.getXPos() < 443 && timer > 50;
		boolean platform6 = Player.getYPos() < 618 && Player.getYPos() > 580 && Player.getXPos() > 20
				&& Player.getXPos() < 80 && timer > 50;
		boolean platform7 = Player.getYPos() < 620 && Player.getYPos() > 576 && Player.getXPos() > 380
				&& Player.getXPos() < 446 && timer > 50;

		if (platform1) {

			way1to2 = !way1to2;
			way1to5 = !way1to5;
			timer = 0;
		}

		if (platform2) {

			way1to2 = !way1to2;
			way2to3 = !way2to3;
			way2to4 = !way2to4;
			timer = 0;
		}

		if (platform3) {

			way2to3 = !way2to3;
			way3to7 = !way3to7;

			timer = 0;
		}

		if (platform4) { // 7

			way3to7 = !way3to7;
			way6to7 = !way6to7;

			timer = 0;
		}

		if (platform5) { // 4

			way2to4 = !way2to4;

			way4to6 = !way4to6;

			timer = 0;
		}

		if (platform6) { // 5

			way1to5 = !way1to5;
			way5to6 = !way5to6;
			timer = 0;
		}

		if (platform7) { // 6

			way6to7 = !way6to7;
			way4to6 = !way4to6;
			way5to6 = !way5to6;
			timer = 0;
		}

		

	}
	
	
	/**
	 * since the room3 is little bit difficult some ways will be drawn 
	 * every one minutes as help 
	 */

	public void helpMetods() {
		if (timer > 600) {
			way4to6 = true;
		}
		if (timer > 1800) {
			way1to2 = true;
		}
		if (timer > 2200) {
			way4to6 = true;
		}
		if (timer > 2500) {
			way2to3 = true;
		}
		if (timer > 2700) {
			way4to6 = true;
		}
		if (timer > 3000) {
			way5to6 = true;
		}
	}
	
	/**
	 * if its difficult to solve there will be a button that will turn on all the ways/lights, 
	 */

	public void turnOnAll() {
		boolean giveupplatforms = Player.getYPos() < 130 && Player.getXPos() > 650 && Player.getXPos() < 770
				&& timer > 50;
		if (giveupplatforms) {

			way1to2 = true;
			way1to5 = true;
			way2to3 = true;
			way2to4 = true;
			way3to7 = true;
			way6to7 = true;
			way4to6 = true;
			way5to6 = true;

		}

	}
/**
 * if you want to restart/reset the ways in room3
 */
	public void TurnoffAll() {
		boolean resetplattform = Player.getYPos() < 130 && Player.getXPos() > 10 && Player.getXPos() < 100
				&& timer > 50;
		;
		if (resetplattform) {

			way1to2 = false;
			way1to5 = false;
			way2to3 = false;
			way2to4 = false;
			way3to7 = false;
			way6to7 = false;
			way4to6 = false;
			way5to6 = false;
		}
	}
/**
 * this method is been used in gamestate3 and will helps if the game is done or not
 * @return all flags
 */
	public boolean allFlags() {

		return way1to2 && way1to5 && way2to3 && way2to4 && way3to7 && way6to7&&way5to6;

	}
}
