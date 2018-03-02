package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;

public class Victory extends States {
	
	private MenuState menustate;
	
	
	public Victory(Gameengine game) {
		super(game);
	}

	@Override
	public void tick() {
		if(game.getKeyManager().isEsc()) {
			menustate = new MenuState(game);

			setRoomState(menustate);

		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room7, (int) 0, (int) 0, null);
		
		g.drawString("Your time: " + String.valueOf(Gamestate.getTime()/60),  320,300);
		Gamestate.setStopTime();
	}
	
	
	

}
