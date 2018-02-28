package javaapp.Runner.Gameengine;

import java.awt.Graphics;

public class Player extends Entity {

	private Gameengine game;
	private int a;

	public Player(Gameengine game, float x, float y) {
		super(x, y);
		this.game = game;
	}

	public static float getYPos() {
		return y;
	}

	public static float getXPos() {
		return x;
	}

	public static void setYPos(float temp) {
		y = temp;
	}

	public static void setXPos(float temp) {
		x = temp;
	}

	@Override
	public void tick() {
		if (game.getKeyManager().isUp()) {
			a = 0;
			if (y > 115)
				y -= 4;
		}
		if (game.getKeyManager().isDown()) {
			a = 1;
			if (y < 635)
				y += 7;
		}
		if (game.getKeyManager().isLeft()) {
			a = 2;
			if (x > 10)
				x -= 3;
		}
		if (game.getKeyManager().isRight()) {
			a = 3;
			if (x < 770)
				x += 3;
		}

	}

	@Override
	public void render(Graphics g) {
		if (a == 0) {
			g.drawImage(Assets.player2, (int) x, (int) y, null);
		}
		if (a == 1) {
			g.drawImage(Assets.player, (int) x, (int) y, null);
		}
		if (a == 2) {
			g.drawImage(Assets.player3, (int) x, (int) y, null);
		}
		if (a == 3) {
			g.drawImage(Assets.player4, (int) x, (int) y, null);
		}
		g.drawImage(Assets.banner1, (int) 0, (int) 645, null);

	}
}
