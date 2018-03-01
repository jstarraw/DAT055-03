package javaapp.Runner.Room3;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;

public class StreetLight {

	public static int timer = 100;

	public boolean way1to2 = false;
	public boolean way1to5 = false;
	public boolean way2to3 = false;
	public boolean way2to4 = false;
	public boolean flagga5 = false;
	public boolean way6to7 = false;
	public boolean way4to6 = false;
	public boolean way5to6 = false;
	public boolean flagga9 = false;

	public StreetLight() {

	}

	public void tick() {
		timer++;

		boolean platform1 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 10
				&& Player.getXPos() < 100 && timer > 200;
		boolean platform2 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 370
				&& Player.getXPos() < 450 && timer > 200;
		boolean platform3 = Player.getYPos() < 290 && Player.getYPos() > 200 && Player.getXPos() > 680
				&& Player.getXPos() < 780 && timer > 200;
		boolean platform4 = Player.getYPos() < 620 && Player.getYPos() > 573 && Player.getXPos() > 704
				&& Player.getXPos() < 770 && timer > 200;
		boolean platform5 = Player.getYPos() < 456 && Player.getYPos() > 411 && Player.getXPos() > 383
				&& Player.getXPos() < 443 && timer > 200;
		boolean platform6 = Player.getYPos() < 618 && Player.getYPos() > 580 && Player.getXPos() > 20
				&& Player.getXPos() < 80 && timer > 200;
		boolean platform7 = Player.getYPos() < 620 && Player.getYPos() > 576 && Player.getXPos() > 380
				&& Player.getXPos() < 446 && timer > 200;

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
			flagga5 = !flagga5;
			flagga9 = !flagga9;
			timer = 0;
		}

		if (platform4) {

			flagga5 = !flagga5;
			way6to7 = !way6to7;

			timer = 0;
		}

		if (platform5) {

			way2to4 = !way2to4;

			way4to6 = !way4to6;
			flagga9 = !flagga9;

			timer = 0;
		}

		if (platform6) {

			way1to5 = !way1to5;
			way5to6 = !way5to6;
			timer = 0;
		}

		if (platform7) {

			way6to7 = !way6to7;
			way4to6 = !way4to6;
			way5to6 = !way5to6;
			timer = 0;
		}

	}

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
		if (flagga5) {
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
		//
		//
		if (way4to6) {
			g.drawImage(Assets.streetlight, (int) 410, (int) 480 + 8, null);
			g.drawImage(Assets.streetlight, (int) 410, (int) 530 + 3, null);

		}
		
		

	}
	
	public boolean allFlags() {
		return  way1to2&&way1to5 && way2to3 && way2to4&& flagga5&& way6to7;//flgga7;
	}
}
