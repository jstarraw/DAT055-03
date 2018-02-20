package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;



public class RoomState2 extends States{
	
	private States room3;
	private Player player;
	public RoomState2(Gameengine game) {
		super(game);
		room3 = new RoomState3(game);
		player = new Player(game,500,500);
		// TODO Auto-generated constructor stub
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

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room3, (int) 0, (int) 0, null);
		g.drawImage(Assets.ball1, (int) 200, (int) 200, null);
		player.render(g);
	}


}
