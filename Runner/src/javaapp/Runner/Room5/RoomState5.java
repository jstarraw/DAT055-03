package javaapp.Runner.Room5;
import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.States.States;

public class RoomState5 extends States{

	private static boolean flag1, flag2, flag3;
	


public RoomState5(Gameengine game) {
	super(game);
}


public void tick() {	
	if(Player.getXPos()>10 && Player.getXPos()<200 && Player.getYPos()>286 && Player.getYPos()<520) {
		flag1 = true;
	}
	else flag1 = false;
	if(Player.getXPos()>170 && Player.getXPos()<276 && Player.getYPos()>40 && Player.getYPos()<140 && game.getKeyManager().isInteract()) {
		flag2 = true;
	}
	
	if(Player.getXPos()>440 && Player.getXPos()<545 && Player.getYPos()>40 && Player.getYPos()<140  && game.getKeyManager().isInteract()) {
		flag3 = true;
		}
	}


public void render(Graphics g) {
	g.drawImage(Assets.room6, (int) 0, (int) 0, null);
	if(flag1)g.drawImage(Assets.bubble, (int) 30, (int) 152, null);
	if(flag2)g.drawImage(Assets.win, (int) 30, (int) 235, null);
	if(flag3)g.drawImage(Assets.gameover, (int) 30, (int) 235, null);
}



}
