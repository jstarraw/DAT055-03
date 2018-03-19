package javaapp.Runner.States;

import java.awt.Graphics;
import java.io.IOException;
import java.net.UnknownHostException;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Highscore;
import javaapp.Runner.Gameengine.Name;

/**
 * This class handles the victory screen which can be viewed in the last stage of the game
 * @Author Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */

public class Victory extends States {
	private static int timer =0;
	private static StringBuilder value;
	
	/**
	 * 
	 * Constructor for the class Victory 
	 * The gameengine object, game,
	 * @param game
	 */
	
	public Victory(Gameengine game) {
		super(game);
	}

	
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * renders last screen
	 */
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room7, (int) 0, (int) 0, null);
		g.drawString("Your time: " + String.valueOf(Gamestate.getTime()/60),  320,300);

		if(timer == 0 ) 
			sendtoHighscore();
	

			timer++;
			
			
		
		Gamestate.setStopTime();
	}
	/**
	 * Adds time and name together.
	 * @return returns name and time as a string
	 */
	public static String nameAndTime() {
		return null;
		/*value.append(Name.getPlayerId());
		value.append(" ");
		value.append(Gamestate.getTime()/60);
		value.append("s,");
		return value.toString();*/
	}
	/*
	 * Calls on sendtoserver.
	 */
	public void sendtoHighscore() {
	/*	
		try {
			Highscore.sendtoserver();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
	}
		
	
	

}
