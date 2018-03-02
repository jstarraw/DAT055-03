package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */


public class Victory extends States {
	
	private MenuState menustate;
	
	
	/**
	 * 
	 * The constructor of the Victory class
	 * @param game
	 */
	
	public Victory(Gameengine game) {
		super(game);
	}

	/**
	 * Updates the parameters every second
	 * 
	 */
	
	@Override
	public void tick() {
		if(game.getKeyManager().isEsc()) {
			menustate = new MenuState(game);

			setRoomState(menustate);
			
		}
	}

	
	/**
	 * 
	 * Draws the victory image 
	 * Draws the time that has passed since the game started until the end
	 */
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room7, (int) 0, (int) 0, null);
		
		g.drawString("Your time: " + String.valueOf(Gamestate.getTime()/60),  320,300);
		Gamestate.setStopTime();
	}
	
	
	

}
