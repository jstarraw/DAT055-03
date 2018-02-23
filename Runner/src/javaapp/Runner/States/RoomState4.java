package javaapp.Runner.States;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

//Author Jenny Karlsson

public class RoomState4 extends States {

	private States roomstate5, roomstate1;
	private Player player;
	private static int doorposY = 53;
	private Banana banana;
	private Trap trap;
	private Zombie zombie;


	public RoomState4(Gameengine game) {
		super(game);
		roomstate1 = new RoomState1(game);
		roomstate5 = new RoomState5(game);
		player = new Player(game, 500, 500);
		banana = new Banana();
		trap = new Trap();
		zombie = new Zombie();
		
	}
	
	public void tick() {
		player.tick();
		banana.tick();
		trap.tick();
		zombie.tick();
		
		if(!Banana.flagga1 && !Banana.flagga2 && !Banana.flagga3 && !Banana.flagga5
				&& !Banana.flagga6){
			doorposY--;
			if(Player.getYPos()< 130 && Player.getXPos()>300 && Player.getXPos() < 400)
			{
			
				if(game.getKeyManager().interact)
					setNextRoom();
			}
		}	
	}

	public void render(Graphics g) {

		g.drawImage(Assets.room4, (int) 0,(int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		banana.render(g);
		trap.render(g);
		player.render(g);
		zombie.render(g);
	}

	public void pickUp() {

	}

	public void setNextRoom() {

		setRoomState(roomstate1);
		Player.setYPos(650);
		Player.setXPos(300);

}


}