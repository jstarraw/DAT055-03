package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room1.RoomState1;


public class Gamestate extends States {
	private Player player;
	private States roomstate1;
	private static boolean timeflag = true;
	private static int secondpassed = 0;

	public Gamestate(Gameengine game) {
		super(game);
		player = new Player(game, 150, 600);
		roomstate1 = new RoomState1(game);

		setRoomState(roomstate1);
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
