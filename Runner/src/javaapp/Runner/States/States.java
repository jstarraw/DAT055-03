package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */

public abstract class States {

	protected Gameengine game;
	
	
	/**
	 * 
	 * The constructor of States
	 * @param game
	 */

	public States(Gameengine game) {
		this.game = game;
	}

	private static States currentState = null;
	private static States roomState = null;
	

	/**
	 * Sets the current state
	 * 
	 * @param state
	 */

	public static void setState(States state) {
		currentState = state;
	}

	/**
	 * 
	 * returns the currentState of the game
	 * @return currentState
	 */
	public static States getState() {
		return currentState;
	}
	
	/**
	 * 
	 * Sets the RoomStates for all rooms
	 * @param rooms
	 */

	public static void setRoomState(States rooms) {
		roomState = rooms;
	}

	/**
	 * 
	 * returns the roomState
	 * @return roomState
	 */
	public static States getRoomState() {
		return roomState;
	}

	public abstract void tick();

	public abstract void render(Graphics g);
}
