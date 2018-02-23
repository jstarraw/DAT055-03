package javaapp.Runner.States;

import java.awt.Graphics;
import java.lang.Thread.State;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

//Author Jenny Karlsson

public class Trap  {

	private float posX, posY; 
	private Gameengine game;
	
	public void tick(){
		
	if(Player.getXPos() > 430 && Player.getXPos() < 480 && Player.getYPos() > 530 && Player.getYPos() < 580) 
		restartPlayer();
	if(Player.getXPos() > 250 && Player.getXPos() < 300 && Player.getYPos() > 370 && Player.getYPos() < 400) 
		restartPlayer();
	if(Player.getXPos() > 450 && Player.getXPos() < 500 && Player.getYPos() > 250 && Player.getYPos() < 300) 	
		restartPlayer();
	if(Player.getXPos() > 550 && Player.getXPos() < 600 && Player.getYPos() > 550 && Player.getYPos() < 600) 
		restartPlayer();
	if(Player.getXPos() > 230 && Player.getXPos() < 280 && Player.getYPos() > 450 && Player.getYPos() < 500) 
		restartPlayer();
	if(Player.getXPos() > 130 && Player.getXPos() < 180 && Player.getYPos() > 550 && Player.getYPos() < 600) 
		restartPlayer();
	if(Player.getXPos() > 550 && Player.getYPos() < 600 && Player.getYPos() > 450 && Player.getYPos() < 500)
		restartPlayer();
	}
	//Remove 50 pixels, keep the value, remove 50 pixels, keep the value
	
	public void restartPlayer(){
		setPlayer();
		setBananaFlags();
	}
	public void setPlayer(){
		Player.setXPos(650);
		Player.setYPos(300);
	}
	
	public void setBananaFlags(){
		
		Banana.flagga1 = true;
		Banana.flagga2 = true;
		Banana.flagga3 = true;
		Banana.flagga4 = true;
		Banana.flagga5 = true;
		Banana.flagga6 = true;
		Banana.flagga7 = true;
		Banana.flagga8 = true;
		Banana.flagga9 = true;
		Banana.flagga10 = true;
	}
	
	public void render(Graphics g){
		
		g.drawImage(Assets.trap, (int) 480, (int) 580, null);
		g.drawImage(Assets.trap, (int) 300, (int) 400, null);
		g.drawImage(Assets.trap, (int) 500, (int) 300, null);
		g.drawImage(Assets.trap, (int) 600, (int) 600, null);
		g.drawImage(Assets.trap, (int) 280, (int) 500, null);
		g.drawImage(Assets.trap, (int) 180, (int) 600, null);
		g.drawImage(Assets.trap, (int) 600, (int) 500, null);
		
		
	}
	
	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}
}