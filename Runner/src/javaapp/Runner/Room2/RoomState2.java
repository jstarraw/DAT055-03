package javaapp.Runner.Room2;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;
import javaapp.Runner.Room3.RoomState3;
import javaapp.Runner.States.States;


/**
 * This class handles RoomState2 which is the second "play room" in the game
 * @Author Daniel Cebe
 * @version 2018-03-01
 * 
 */

public class RoomState2 extends States {
	private Candle candle;
	private List<Candle> candleList = new ArrayList<Candle>();
	private States room3;

	private Bomb bomb1, bomb2, bomb3;
	private static int doorposY = 53;
	private static int doorflag = 0;
	private static boolean flagga1 = false;

	/**
	 * The constructor of the Roomstate2 class, that initiates candles, bombpositions/speed and prepares the next room 
	 * The gameengine object game
	 * @param game
	 */

	public RoomState2(Gameengine game) {
		super(game);
		room3 = new RoomState3(game);
		BombPosAndSpeed();
		createCandles();
	}
	
	
	/**
	 * Updates the parameters for the Roomstate2, which refers to this room
	 * 
	 */

	public void tick() {

		setNextRoom();
		candleTick();

	}
	
	
	/** 
	 * 
	 * Ticks the candles
	 * The method look for the 12 candles and goes through them
	 * if all lights of the candles successfully are turned off, the door opens
	 */
	
	public void candleTick() {
		
		doorflag = 0;
	
		
		bomb1.tick();
		bomb2.tick();
		bomb3.tick();
		
		for (Candle candle : candleList) {
			candle.tick();
			if (candle.getFlag())
				doorflag++;
			candle.tick();

			if (doorflag == 12)
				flagga1 = true;

		}

	}
	
	/** 
	 * 
	 * initiates the bomb with given x and y pos and also a speed
	 * 
	 */
	
	public void BombPosAndSpeed() {
		bomb1 = new Bomb(150, 570, 15);
		bomb2 = new Bomb(320, 570, 15);
		bomb3 = new Bomb(540, 100, 21);
		
	}
	
	/** 
	 * 
	 * creates all candles 
	 * 
	 */
	public void createCandles() {
		
		for (int a = 1; a < 9; a += 2) {
			for (int y = 1; y < 4; y++) {
				candle = new Candle(90 * a, y * 180);
				candleList.add(candle);
			}
		}
	}

	/**
	 * 
	 * Draws my room, door, doorbanner
	 * Calls all three bombs from the bomb class and draws the bombs 
	 * Draw all candles 
	 * graphics object g
	 * @param g
	 */
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room3, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 700, (int) doorposY, null);
		g.drawImage(Assets.doorbanner, (int) 687, (int) 0, null);

		bomb1.render(g);
		bomb2.render(g);
		bomb3.render(g);

		for (Candle candle : candleList)
			candle.render(g);

	}
	
	
	
	/**
	 * Sets the next room, calling next roomstate and sets the player on given positions
	 * 
	 * 
	 */
	public void setNextRoom() {
		if (flagga1)
			doorposY--;

		if (Player.getYPos() < 130 && Player.getXPos() > 700 && Player.getXPos() < 800 && flagga1) { 
		
		Player.setYPos(440);
		Player.setXPos(100);
		setRoomState(room3);
	}
		}

}
