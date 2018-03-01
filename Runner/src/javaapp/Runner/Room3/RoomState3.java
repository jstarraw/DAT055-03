package javaapp.Runner.Room3;



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
	
	
	
	public RoomState3(Gameengine game) {
		super(game);
		light = new StreetLight();
		door1 = new Doors_Room3( 332);
		door2 = new Doors_Room3(395);
		number = new TimeTaker(100,100);
		room4 = new RoomState4(game);
	}

	
	public void tick() {
		
	light.tick();
	number.tick();
	if(light.allFlags()) {
		  door2.tickLeftdoor();
		  door1.tickRightdoor();}	
	if(door1.getDoorposition() && door2.getDoorposition() ) {
		setRoomState(room4);
		Player.setYPos(700);
		
	}
		

		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.room4, (int) 0, (int) 0, null);
			door1.renderDoorleft(g);
			door2.renderDoorRight(g);
		    light.render(g);
			number.render(g);
	}


}


