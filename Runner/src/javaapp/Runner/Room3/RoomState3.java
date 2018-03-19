package javaapp.Runner.Room3;

/**
 * 
This class starts the room3 itself, it brings together all the associated elemetries
 that are part of rooom4. ie street lights and time taker.
 
 *  @author nurabd
 * @Version 2018-03-01
 *  
 * 
 */

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room4.*;
import javaapp.Runner.States.States;



public class RoomState3 extends States{
	private StreetLight light;
	private Doors_Room3 door1;
	private Doors_Room3 door2;
	private TimeTaker number;
	private States room4;
	
	
	/**
	 * 
	 * @param game the gameengine class 
	 */
	public RoomState3(Gameengine game) {
		super(game);
		light = new StreetLight();
		door1 = new Doors_Room3( 332);
		door2 = new Doors_Room3(395);
		number = new TimeTaker();
		room4 = new RoomState4(game);
	}

	/**
	 * Tick method will tick the components of room3
	 * its here the Gamestate3 i build 
	 * tick method override states
	 */
	public void tick() {
		
	light.tick();
	number.tick();
	if(light.allFlags()) {
		  door2.tickLeftdoor();
		  door1.tickRightdoor();}	
	if(door1.isDoorposition() && door2.isDoorposition() && light.allFlags()) {
		setRoomState(room4);
		Player.setYPos(700);
		
	}
		

		
	}
/**
 * render method will render the components of room3
	 * it here the Gamestate3 is build 
	 * render method override states 
 * 
 */
	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.room4, (int) 0, (int) 0, null);
			door1.renderDoorleft(g);
			door2.renderDoorRight(g);
		    light.render(g);
			number.render(g);
	}


}


