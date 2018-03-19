package javaapp.Runner.Room5;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.States.States;
import javaapp.Runner.States.Victory;

/**
 * This class handles Room5 and its game events
 * @author Roman Melnik
 * @version 2018-03-01
 * flag1 is set to true if the player approaches the matematician; it is used to make a speech bubble appear.
 * flag2 is set to true if the player opens the right door.
 * flag3 is set to true if the player opens the wrong door.
 * victory is used when a player opens the right door, thus completing the game.
 */


public class RoomState5 extends States {

	private static boolean flag1, flag2, flag3;

	private States victory;

	
	/**
	 * 
	 * The constructor for the room5 
	 * @param game
	 * 
	 */


	public RoomState5(Gameengine game) {
		super(game);
		victory = new Victory(game);
		
	}

	
	/**
	 * Takes input from the keyboard and sets boolean flags that lead to other events in the game.  
	 *@param  
	 */
	
	public void tick() {
		if (Player.getXPos() > 10 && Player.getXPos() < 200 && Player.getYPos() > 286 && Player.getYPos() < 520) {
			flag1 = true;
		} else
			flag1 = false;
		if (Player.getXPos() > 170 && Player.getXPos() < 276 && Player.getYPos() > 40 && Player.getYPos() < 140
				&& game.getKeyManager().isInteract()) {
			flag2 = true;
			setRoomState(victory);
			Player.setYPos(7650);
			Player.setXPos(7300);

		}

		if (Player.getXPos() > 440 && Player.getXPos() < 545 && Player.getYPos() > 40 && Player.getYPos() < 140
				&& game.getKeyManager().isInteract()) {
			flag3 = true;
		}
	}

	/**
	 * Renders the room and the speech bubbles that may show up
	*@param g
	*room6 is the image for the room
	*bubble is the matematician's speech bubble with details about the problem
	*win is the speech bubble that appears when the player chooses the right door
	*gameover is the speech bubble that appears when the player chooses the wrong door 
	*/
	
	public void render(Graphics g) {
		g.drawImage(Assets.room6, (int) 0, (int) 0, null);
		if (flag1)
			g.drawImage(Assets.bubble, (int) 30, (int) 152, null);
		if (flag2)
			g.drawImage(Assets.win, (int) 30, (int) 235, null);
		if (flag3)
			g.drawImage(Assets.gameover, (int) 30, (int) 235, null);
	}

}
