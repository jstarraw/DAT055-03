package javaapp.Runner.Room3;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Entity;
import javaapp.Runner.Gameengine.Gameengine;

public class Doors_Room3 {

	public Gameengine game;
	private float x, y;

	public Doors_Room3(Gameengine game, float x, float y) {
		this.x = x;
		this.y = y;
		this.game = game;

	}

	public void tickLeftdoor() {

		x++;
		// if(x > 430){
		// setX(430);
		//
	}

	// }
	public void tickRightdoor() {

		x--;
		// if(x < 285){
		// setX(285);
		// }

	}

	// public void closeLeftdoor(){
	//
	//
	// if(x > 430){
	// x--;
	//
	// }
	//
	// }
	//

	public void renderDoorleft(Graphics g) {

		g.drawImage(Assets.door1, (int) x, (int) y, null);

	}

	public void renderDoorRight(Graphics g) {

		g.drawImage(Assets.door2, (int) x, (int) y, null);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
