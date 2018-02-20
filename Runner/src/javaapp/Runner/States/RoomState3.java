package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;



public class RoomState3 extends States{
	
	//private States room2;
	public RoomState3(Gameengine game) {
		super(game);
		//room2 = new RoomState2(game);

		// TODO Auto-generated constructor stub
	}

	
	public void tick() {
		if (Player.getYPos() > 300)
		{
			//setRoomState(room2);
			
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room3, (int) 0, (int) 0, null);
		
	}


}
