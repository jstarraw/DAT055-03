package javaapp.Runner.Room4;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room1.RoomState1;
import javaapp.Runner.Room5.RoomState5;
import javaapp.Runner.States.States;

/**
 * 
 * @author jenny
 *
 */

public class RoomState4 extends States {

	private States roomstate5, roomstate1;
	private static int doorposY = 53;
	private Banana banana;
	private Trap trap;

	public RoomState4(Gameengine game) {
		super(game);
		// roomstate1 = new RoomState1(game);
		roomstate5 = new RoomState5(game);
		// player = new Player(game, 500, 500);
		banana = new Banana();
		trap = new Trap();

	}

	public void tick() {
		// player.tick();
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

	public void render(Graphics g) {

		g.drawImage(Assets.room5, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		banana.render(g);
		trap.render(g);
		// player.render(g);
	}

	public void pickUp() {

	}

	public void setNextRoom() {

		setRoomState(roomstate5);
		Player.setYPos(650);
		Player.setXPos(300);

	}

}