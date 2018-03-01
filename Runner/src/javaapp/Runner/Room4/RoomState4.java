package javaapp.Runner.Room4;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room5.RoomState5;
import javaapp.Runner.States.States;

/**
 * 
 * @author jenny
 * @version 2017-02-27
 */

public class RoomState4 extends States {

	private States roomstate5;
	private static int doorposY = 53;
	private Banana banana;
	private Trap trap;

	public RoomState4(Gameengine game) {
		super(game);
		banana = new Banana();
		trap = new Trap();
		roomstate5 = new RoomState5(game);

	}

	/**
	 * Ticks the banana and trap classes. Takes care of the event happens with the
	 * room when in it
	 * 
	 * @param
	 */
	public void tick() {

		banana.tick();
		trap.tick();

		if (!Banana.flagga1 && !Banana.flagga2 && !Banana.flagga3 && !Banana.flagga4 && !Banana.flagga5
				&& !Banana.flagga6 && !Banana.flagga7 && !Banana.flagga8 && !Banana.flagga9 && !Banana.flagga10
				&& !Banana.flagga11 && !Banana.flagga12 && !Banana.flagga13) {
			doorposY--;
			if (Player.getYPos() < 130 && Player.getXPos() > 300 && Player.getXPos() < 400) {

				if (game.getKeyManager().isInteract())
					setNextRoom();
			}
		}
	}

	/**
	 * Draws the room and door and sets the banana and traps.
	 * 
	 * @param g
	 */
	public void render(Graphics g) {

		g.drawImage(Assets.room5, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		banana.render(g);
		trap.render(g);
		// player.render(g);
	}

	/**
	 * Sets the next room, calling next roomstate and sets the player
	 * 
	 * @param
	 */
	public void setNextRoom() {

		setRoomState(roomstate5);
		Player.setYPos(650);
		Player.setXPos(300);

	}

}