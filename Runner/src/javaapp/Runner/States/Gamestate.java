package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Gameengine.Room;
import javaapp.Runner.Room1.RoomState1;

public class Gamestate extends States {
private Player player;
private States roomstate1;

	public Gamestate(Gameengine game){
		super(game);
		player = new Player(game, 150, 600);
		roomstate1 = new RoomState1(game);
		
		setRoomState(roomstate1);
	}
	
	@Override
	public void tick() {
		player.tick();
		getRoomState().tick();
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
