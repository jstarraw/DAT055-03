package javaapp.Runner.Gameengine;

import java.awt.Graphics;

public class Room {

	private Gameengine game;
	private static int roomNum = 0;

	public Room(Gameengine game) {

		this.game = game;
	}

	public void render(Graphics g) {

		g.drawImage(Assets.room1, (int) 0, (int) 0, null);

	}

	public void setChangeRoom() {
		roomNum++;
	}
}
