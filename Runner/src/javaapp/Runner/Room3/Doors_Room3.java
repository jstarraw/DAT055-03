package javaapp.Runner.Room3;
		
import java.awt.Graphics;		
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;	

public class Doors_Room3 {
private float x ;
			
public Doors_Room3( float x ){
		this.x=x;
				}
	/**
	 * 		
	 */
	public void tickLeftdoor(){
				
		x++;
	if(x > 430)x=430;
			}
	/**
	 * 
	 */
	public void tickRightdoor(){
		x--;
		if(x < 285)setX(285);
}
/**
 * 
 * @param g
 */
			
public void  renderDoorleft(Graphics g){
				
	g.drawImage(Assets.door1, (int)x, (int) 45, null);
}

/**
 * 
 * @param g
 */
public void  renderDoorRight(Graphics g){
		g.drawImage(Assets.door2, (int) x, (int) 45, null);
	}

/**
 * 
 * @return
 */
public float getX() {
	
	return x;
}
	/**
	 * 	
	 * @param x
	 */
public void setX(float x) {
	
				this.x = x;
			}

public boolean getDoorposition() {
	
	return Player.getYPos() < 141 && Player.getXPos() < 407 && Player.getXPos() < 385;
}
	
		}
