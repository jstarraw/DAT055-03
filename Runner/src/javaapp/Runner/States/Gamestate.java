package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room1.RoomState1;


/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */

public class Gamestate extends States {
	private Player player;
	private States roomstate1;
	private static boolean timeflag = true;
	private static int secondpassed = 0;

	
	/**
	 *
	 * Constructor of the GameState class.
	 * initiates the player, and the sets the first RoomState
	 * @param game
	 */
	
	public Gamestate(Gameengine game) {
		super(game);
		player = new Player(game, 150, 600);
		roomstate1 = new RoomState1(game);

		setRoomState(roomstate1);
	}

	/**
	 * 
	 * Updates the parameters 
	 * 
	 */
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

	/**
	 * Render the room then the player
	 * 
	 */
	@Override
	public void render(Graphics g) {
		getRoomState().render(g);
		player.render(g);

	}// test
	
	
	/**
	 * 
	 * Returns the time that is passed
	 * @return secondpassed
	 * 
	 */
	public static int getTime()
	{
		
		return secondpassed;
	}
	
	
	/**
	 * 
	 * Stops the time
	 */
	public static void setStopTime() {
		timeflag = false;
	}
	

}
