package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;

public class Candle {

	private int x; int y;
	private boolean lit = true ;
	public Gameengine game;
	
	
	
public Candle (Gameengine game,int x, int y) {
		this.x=x;
		this.y=y;
		this.game= game;
		
}

public void tick() {
	
	collisionDetect();
 
	}


public void collisionDetect () {
	
	if(x+60 > Player.getXPos() && x<Player.getXPos()+25) {
		if(y+65 > Player.getYPos() && y<Player.getYPos()) {
		
		lit = false;	
	}
		
	}
}
	





public void setLit(boolean lit) {
	this.lit = lit;
}



public boolean getFlag() {
	
	return !lit;
}

public void render(Graphics g) {
	
	if(lit)
		g.drawImage(Assets.stearin, (int) x, (int) y, null);
	
	else
		g.drawImage(Assets.stearin1, (int) x, (int)y , null);
	
	

	
	
	
	}

}
