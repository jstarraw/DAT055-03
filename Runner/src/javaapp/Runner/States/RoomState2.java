package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;



public class RoomState2 extends States{
	
	private States room3;
	public RoomState2(Gameengine game) {
		super(game);
		room3 = new RoomState3(game);

		// TODO Auto-generated constructor stub
	}

	
	public void tick() {
		if (Player.getYPos() < 120)
		{
			setRoomState(room3);
			Player.setYPos(650);
			
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room2, (int) 0, (int) 0, null);
		
	}


}
