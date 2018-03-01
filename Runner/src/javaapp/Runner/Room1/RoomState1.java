
package javaapp.Runner.Room1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room2.RoomState2;
import javaapp.Runner.States.States;

public class RoomState1 extends States {

	private States roomstate2;
	private Arrow arrow;
	private Buttons buttons;
	private List<Arrow> ArrowList = new ArrayList<Arrow>();

	private static int doorposY = 53;
	/*
	 * Constructor for Roomstate. 
	 * 
	 */
	public RoomState1(Gameengine game) {
		super(game);
		roomstate2 = new RoomState2(game);
		buttons = new Buttons();
		for (int x = 70; x < 800; x += 70) {
			Arrow arrow = new Arrow();
			ArrowList.add(arrow);
		}
		// TODO Auto-generated constructor stub
	}
	/**
	 *  Updates parameters for everything in the room, arrow, buttons,
	 */
	public void tick() {
		for (Arrow arrow : ArrowList) {
			arrow.tick();
		}

		if (game.getKeyManager().isInteract())
			buttons.tick();

		if (buttons.checkFlags()) {
			doorposY--;
			if (Player.getYPos() < 130 && Player.getXPos() > 300 && Player.getXPos() < 400) {
				if (game.getKeyManager().isInteract())
					setNextRoom();
			}
		}
	}
	/**
	 * renders everything in the room.
	 */
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room2, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		g.drawImage(Assets.TopBanner, (int) 337, (int) 0, null);
		buttons.render(g);

		for (Arrow arr : ArrowList) {
			arr.render(g);
		}

	}
	/**
	 * Changes the roomstate to the next room
	 */
	public void setNextRoom() {

		
		Player.setYPos(650);
		Player.setXPos(300);
		setRoomState(roomstate2);

	}

}