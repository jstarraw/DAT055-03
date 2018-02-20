//Jennys room
package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;



public class RoomState4 extends States {
	
	private States roomstate5;
	private Player player;
	private static int doorposY = 53;
	
	public RoomState4(Gameengine game) {
		super(game);
		roomstate5 = new RoomState5(game);
		player = new Player(game, 350, 500);
	}
	
	public void tick() {
		player.tick();
		
//		if (Player.getYPos() < 120)
//		{
//			//setRoomState(room3);
//			Player.setYPos(850);
//			Player.setXPos(30);
//			
//		}
		
	}
	
	public void render(Graphics g) {
		//g.drawImage(Assets.room3, (int) 0, (int) 0, null);
		//g.drawImage(Assets.ball1, (int) 200, (int) 200, null);
		g.drawImage(Assets.room4, (int) 0,(int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		player.render(g);
	}
	
	public void setNextRoom() {
		
		setRoomState(roomstate5);
		Player.setYPos(650);
		Player.setXPos(300);
	
}
	
	
}
