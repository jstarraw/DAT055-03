package javaapp.Runner.States;

import java.awt.Graphics;
import java.io.IOException;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Highscore;
import javaapp.Runner.Gameengine.Name;

public class Victory extends States {
	private static int timer =0;
	private static StringBuilder value;
	
	public Victory(Gameengine game) {
		super(game);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room7, (int) 0, (int) 0, null);
		
		g.drawString("Your time: " + String.valueOf(Gamestate.getTime()/60),  320,300);
		if(timer == 0 ) {
			
			value.append(Name.getPlayerId());
			value.append(" ");
			value.append(Gamestate.getTime()/60);
			value.append("s,");
			try {
				Highscore.getHighscore();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			timer++;
			
			
		}
		Gamestate.setStopTime();
	}
	
	public static String nameAndTime() {
		return value.toString();
	}
	

}
