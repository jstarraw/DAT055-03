package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;

//Jenny Karlsson

public class Zombie {
	private float posY;
	private float posX; 
	private float direction = 1, speed2;
	public Gameengine game;
	
	public Zombie(Gameengine game, float posX, float posY, float speed) {
		this.game = game;
		this.posX = posX; 
		this.posY = posY;
		this.speed2 = speed;
	}
	
	public void tick() {
		Collision();
	
		
	}	
	
	public void Collision() {
		
	}
	
	public void render(Graphics g) {
		
	g.drawImage(Assets.zombie,(int) posX,(int) 180, null);
	
	}

	public float getPosY() {
		return posY;
	}


	public void setPosY(float posY) {
		this.posY = posY;
	}


	public float getPosX() {
		return posX;
	}


	public void setPosX(float posX) {
		this.posX = posX;
	}
	
	
}
