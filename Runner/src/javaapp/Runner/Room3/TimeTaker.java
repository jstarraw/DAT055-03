package javaapp.Runner.Room3;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

public class TimeTaker {

	public Gameengine game;
	private float x, y;
	private boolean flagga0, flagga1, flagga2, flagga3, flagga4, flagga5, flagga6, flagga7, flagga8, flagga9, flagga10,
			flagga11, flagga12, flagga13, flagga14, flagga15;
	private int posX = 200;

	private int timer;

	public TimeTaker(Gameengine game, float x, float y) {
		this.x = x;
		this.y = y;
		this.game = game;

	}

	public void tick() {

		timer++;

		int a = 65;
		if (timer > 0 && timer < a)
			flagga0 = true;
		else
			flagga0 = false;

		if (timer > a && timer < a * 2)
			flagga1 = true;
		else
			flagga1 = false;

		if (timer > a * 2 && timer < a * 3)
			flagga2 = true;
		else
			flagga2 = false;

		if (timer > a * 3 && timer < a * 4)
			flagga3 = true;
		else
			flagga3 = false;

		if (timer > a * 4 && timer < a * 5)
			flagga4 = true;
		else
			flagga4 = false;

		if (timer > a * 5 && timer < a * 6)
			flagga5 = true;

		else
			flagga5 = false;

		if (timer > a * 6 && timer < a * 7)
			flagga6 = true;
		else
			flagga6 = false;

		if (timer > a * 7 && timer < a * 8)
			flagga7 = true;
		else
			flagga7 = false;

		if (timer > a * 8 && timer < a * 9)
			flagga8 = true;
		else
			flagga8 = false;

		if (timer > a * 9 && timer < a * 10)
			flagga9 = true;
		else
			flagga9 = false;

		if (timer > a * 10 && timer < a * 11)
			flagga10 = true;
		else
			flagga10 = false;

		if (timer > a * 11 && timer < a * 12)
			flagga11 = true;
		else
			flagga11 = false;

		if (timer > a * 12 && timer < a * 13)
			flagga12 = true;
		else
			flagga12 = false;

		if (timer > a * 13 && timer < a * 14)
			flagga13 = true;
		else
			flagga13 = false;

		if (timer > a * 14 && timer < a * 15)
			flagga14 = true;
		else
			flagga14 = false;

		if (timer > a * 15 && timer < a * 16)
			flagga15 = true;
		else
			flagga15 = false;

		if (timer > 1039)
			timer = 0;

		System.out.println("x =" + Player.getXPos() + "\n" + "y =" + Player.getYPos() + "\n");

	}

	public void render(Graphics g) {

		if (flagga0)
			g.drawImage(Assets.siffra0, (int) posX, (int) 75, null);
		if (flagga1)
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
		if (flagga2)
			g.drawImage(Assets.siffra2, (int) posX, (int) 75, null);
		if (flagga3)
			g.drawImage(Assets.siffra3, (int) posX, (int) 75, null);
		if (flagga4)
			g.drawImage(Assets.siffra4, (int) posX, (int) 75, null);
		if (flagga5)
			g.drawImage(Assets.siffra5, (int) posX, (int) 75, null);
		if (flagga6)
			g.drawImage(Assets.siffra6, (int) posX, (int) 75, null);
		if (flagga7)
			g.drawImage(Assets.siffra7, (int) posX, (int) 75, null);
		if (flagga8)
			g.drawImage(Assets.siffra8, (int) posX, (int) 75, null);
		if (flagga9)
			g.drawImage(Assets.siffra9, (int) posX, (int) 75, null);
		if (flagga10) {
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
			g.drawImage(Assets.siffra0, (int) posX + 50, (int) 75, null);
		}
		if (flagga11) {
			g.drawImage(Assets.siffra1, (int) posX + 50, (int) 75, null);
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
		}
		if (flagga12) {
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
			g.drawImage(Assets.siffra2, (int) posX + 50, (int) 75, null);
		}
		if (flagga13) {
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
			g.drawImage(Assets.siffra3, (int) posX + 50, (int) 75, null);
		}
		if (flagga14) {
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
			g.drawImage(Assets.siffra4, (int) posX + 50, (int) 75, null);
		}
		if (flagga15) {
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
			g.drawImage(Assets.siffra5, (int) posX + 50, (int) 75, null);
		}

	}

	public int getTimer() {

		return timer;

	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

}
