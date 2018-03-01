package javaapp.Runner.Room3;		
import java.awt.Graphics;		
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Player;	

/**
 * 
 * @author nurabd 
 *
 */

public class Doors_Room3 {
private float x ;
			/**
			 * 
			 * @param x is the position the door will be able to be drawn
			 */
public Doors_Room3( float x ){
		this.x=x;
		
				}



	/**
	 * 		if the lights from the StreetLigt  are lighted, the left door will open
	 */
	public void tickLeftdoor(){
				
		x++;
	if(x > 430)x=430;
			}
	
	
	/**
	 * if the lights are lighted the right door will open
	 */
	public void tickRightdoor(){
		x--;
		if(x < 285)setX(285);
}
/**
 * 
 * @param g  send a graphic to be able to draw the figure in the canvas
 * 		 the image is bringd from the asset class,
 * 			x is the position that the door eill be drawn in
 */
			
public void  renderDoorleft(Graphics g){
				
	g.drawImage(Assets.door1, (int)x, (int) 45, null);
}

/**
 * 
 * @param g send a graphic to be able to draw the figure in the canvas
 * the image is bringd from the asset class,
 * 			x is the position that the door eill be drawn in
 */
public void  renderDoorRight(Graphics g){
		g.drawImage(Assets.door2, (int) x, (int) 45, null);
	}

/**
 * 
 * @return return the value x.
 */
public float getX() {
	
	return x;
}
	/**
	 * 	
	 * @param x sets  a new value in x.
	 */
public void setX(float x) {
	
				this.x = x;
			}

/**
 * 
 * @return if  the the player is in the position of door the -> will get the position of the door.
 */
public boolean isDoorposition() {
	
	return Player.getYPos() < 130 && Player.getXPos() > 300 && Player.getXPos() < 400;
}
	
		}
