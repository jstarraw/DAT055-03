package javaapp.Runner.Room3;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room4.RoomState4;
import javaapp.Runner.States.States;

public class RoomState3 extends States {
	private StreetLight light;
	private Doors_Room3 door1;
	private Doors_Room3 door2;
	private TimeTaker number;
	private States room4;

	public RoomState3(Gameengine game) {
		super(game);
		light = new StreetLight();
		door1 = new Doors_Room3(332, 45);
		door2 = new Doors_Room3(395, 45);
		number = new TimeTaker( 100, 100);
		room4 = new RoomState4(game);

		// TODO Auto-generated constructor stub
	}

	public void tick() {

		boolean allflag = light.flagga1 && light.flagga2 && light.flagga3;
		boolean doorposition = Player.getYPos() < 141 && Player.getXPos() < 407 && Player.getXPos() < 385;

		light.tick();
		number.tick();

		if (allflag) {
			door1.tickRightdoor();
			door2.tickLeftdoor();

		}
		if (doorposition) {
			Player.setXPos(700);

			door1.tickLeftdoor();
			setRoomState(room4);
		}

	}

	@Override
	public void render(Graphics g) {

		g.drawImage(Assets.room4, (int) 0, (int) 0, null);
		door2.renderDoorRight(g);
		light.render(g);
		door1.renderDoorleft(g);
		number.render(g);

	}

}
