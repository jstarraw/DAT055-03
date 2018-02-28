package javaapp.Runner.States;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Gameengine.Room;
import javaapp.Runner.Room1.RoomState1;
import javaapp.Runner.Room2.RoomState2;
import javaapp.Runner.Room3.RoomState3;

public class Gamestate extends States {
	private Player player;
	private States roomstate1;
	int secondpassed = 0;

	public Gamestate(Gameengine game) {
		super(game);
		player = new Player(game, 150, 600);
		roomstate1 = new RoomState1(game);

		setRoomState(roomstate1);
	}

	@Override
	public void tick() {
		// Timer time = new Timer();

		secondpassed++;
		player.tick();
		getRoomState().tick();
		if (secondpassed % 60 == 0)
			System.out.println(secondpassed / 60);
	}

	/*
	 * Renderar rummet och sedan spelaren.
	 * 
	 */
	@Override
	public void render(Graphics g) {
		getRoomState().render(g);
		player.render(g);

	}// test

}
