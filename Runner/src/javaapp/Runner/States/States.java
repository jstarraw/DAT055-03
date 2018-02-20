package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;

public abstract class States {
	
protected Gameengine game;
	
	public States(Gameengine game){
		this.game = game;
	}
	
	
	
private static States currentState = null;
private static States roomState = null;

	public static void setState(States state){
		currentState = state;
	}
	
	public static States getState(){
		return currentState;
	}
	
	public static void setRoomState(States rooms){
		roomState = rooms;
	}
	
	public static States getRoomState(){
		return roomState;
	}
	
	
	public abstract void tick();
		
		public abstract void render(Graphics g);
}
