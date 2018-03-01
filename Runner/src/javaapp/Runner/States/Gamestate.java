package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room1.RoomState1;
import javaapp.Runner.Room3.RoomState3;

public class Gamestate extends States {
	private Player player;
	private States roomstate3;
	private static boolean timeflag = true;
	private static int secondpassed = 0;

	public Gamestate(Gameengine game) {
		super(game);
		player = new Player(game, 150, 600);
		roomstate3 = new RoomState3(game);

		setRoomState(roomstate3);
	}

	@Override
	public void tick() {
		// Timer time = new Timer();
		if(timeflag)
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
	
	public static int getTime()
	{
		
		return secondpassed;
	}
	public static void setStopTime() {
		timeflag = false;
	}
	

}
