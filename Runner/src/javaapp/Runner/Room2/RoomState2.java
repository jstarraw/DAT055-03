package javaapp.Runner.Room2;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room2.RoomState2;
import javaapp.Runner.Room3.RoomState3;
import javaapp.Runner.States.States;
import javaapp.Runner.States.*;

public class RoomState2 extends States {
	private Candle candle;
	private List<Candle> candleList = new ArrayList<Candle>();
	private States room3;

	private static int timer = 200;
	private Ball boll, boll2, boll3;
	private static int doorposY = 53;
	private static int doorflag = 0;
	private static boolean flagga1 = false;

	private int x;
	private int y;

	public RoomState2(Gameengine game) {
		super(game);
		room3 = new RoomState3(game);

		boll = new Ball(game, 150, 570, 5);
		boll2 = new Ball(game, 320, 570, 5);
		boll3 = new Ball(game, 540, 100, 7);

		for (int a = 1; a < 9; a += 2) {
			for (int y = 1; y < 4; y++) {
				candle = new Candle(game, 90 * a, y * 180);
				candleList.add(candle);
			}
		}

		// TODO Auto-generated constructor stub
	}

	public void tick() {

		if (flagga1)
			doorposY--;

		if (Player.getYPos() < 130 && Player.getXPos() > 700 && Player.getXPos() < 800 && flagga1) {

			setNextRoom();

		}

		doorflag = 0;

		// player.tick();
		boll.tick();
		boll2.tick();
		boll3.tick();

		for (Candle candle : candleList) {
			candle.tick();
			if (candle.getFlag())
				doorflag++;
			candle.tick();

		}
		if (doorflag == 11)
			flagga1 = true;

		if (boll.isFlagg() || boll2.isFlagg() || boll3.isFlagg()) {

			candle.getFlag();

			candle.tick();
			candle.setLit(true);
			timer++;

			candle.tick();
			boll.resetBombFlagg();
			// candle.setLit(true);

			System.out.println(candle.getFlag());

		}

		// System.out.println(Player.getXPos()+ "player");
		// System.out.println(Player.getYPos()+ "player");
		// System.out.println(boll.getX()+"boll" );
		/*
				
					
			
		*/

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room3, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 700, (int) doorposY, null);
		g.drawImage(Assets.doorbanner, (int) 687, (int) 0, null);

		boll.render(g);
		boll2.render(g);
		boll3.render(g);

		for (Candle candle : candleList)
			candle.render(g);

	}

	public void setNextRoom() {

		setRoomState(room3);
		Player.setYPos(440);
		Player.setXPos(100);
	}

}
