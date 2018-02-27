package javaapp.Runner.Room3;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Entity;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.States.States;

public class StreetLight {

	public static int timer = 100;

	public boolean flagga1 = false;
	public boolean flagga2 = false;
	public boolean flagga3 = false;
	public boolean flagga4 = false;
	public boolean flagga5 = false;
	public boolean flagga6 = false;
	public boolean flagga7 = false;
	public boolean flagga8 = false;
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

			flagga1 = !flagga1;
			flagga2 = !flagga2;
			timer = 0;
		}

		if (platform2) {

			flagga1 = !flagga1;
			flagga3 = !flagga3;
			flagga4 = !flagga4;
			timer = 0;
		}

		if (platform3) {

			flagga3 = !flagga3;
			flagga5 = !flagga5;
			flagga9 = !flagga9;
			timer = 0;
		}

		if (platform4) {

			flagga5 = !flagga5;
			flagga6 = !flagga6;

			timer = 0;
		}

		if (platform5) {

			flagga4 = !flagga4;

			flagga7 = !flagga7;
			flagga9 = !flagga9;

			timer = 0;
		}

		if (platform6) {

			flagga2 = !flagga2;
			flagga8 = !flagga8;
			timer = 0;
		}

		if (platform7) {

			flagga6 = !flagga6;
			flagga7 = !flagga7;
			flagga8 = !flagga8;
			timer = 0;
		}

	}

	public void render(Graphics g) {

		// upp horiszontellt ----- vänster
		if (flagga1) {
			g.drawImage(Assets.streetlight, (int) 120, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 170, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 220, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 270, (int) 275 - 2, null);
			g.drawImage(Assets.streetlight, (int) 320, (int) 275 - 2, null);

		}
		// upp horiszontellt ----- höger
		if (flagga3) {
			g.drawImage(Assets.streetlight, (int) 490, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 540, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 590, (int) 272, null);
			g.drawImage(Assets.streetlight, (int) 640, (int) 272, null);
		}
		//
		// // ner horisontelt ---- vänster
		if (flagga8) {
			g.drawImage(Assets.streetlight, (int) 120, (int) 600, null);
			g.drawImage(Assets.streetlight, (int) 170, (int) 600, null);
			g.drawImage(Assets.streetlight, (int) 220, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 270, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320, (int) 598, null);
		}
		// ner horisontelt ---- höger
		if (flagga6) {
			g.drawImage(Assets.streetlight, (int) 490, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 540, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320 + 270, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 270 + 270 + 50, (int) 598, null);
			g.drawImage(Assets.streetlight, (int) 320 + 270 + 50, (int) 598, null);
		}

		// // vänster
		if (flagga2) {
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
		if (flagga4) {
			g.drawImage(Assets.streetlight, (int) 410, (int) 335, null);
			g.drawImage(Assets.streetlight, (int) 410, (int) 380, null);

		}
		//
		//
		if (flagga7) {
			g.drawImage(Assets.streetlight, (int) 410, (int) 480 + 8, null);
			g.drawImage(Assets.streetlight, (int) 410, (int) 530 + 3, null);

		}

	}
}
