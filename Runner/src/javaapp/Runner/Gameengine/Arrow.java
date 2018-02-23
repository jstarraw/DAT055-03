package javaapp.Runner.Gameengine;
import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
//import javaapp.Runner.Gameengine.Gameengine;


public class Arrow {
	
protected static float x=200, y=900;
private static boolean brokenflag = false,dead=false;
	
	public Arrow(){
		
	}
	
	
	public void tick() {
		if(!dead) {
			if(y<120) 
				brokenflag=true;
		
			if(brokenflag)
			{
				x++;
				y++;
			
				if(y>160) {
				
					dead=true;
				}	
			}
		else
			y-=7;
		
		
			}
				
			
	}
	
	public void render(Graphics g) {
		if(!brokenflag)
			g.drawImage(Assets.arrow, (int) x, (int) y, null);
		else
			g.drawImage(Assets.brokenarrow, (int) x, (int) y, null);


		
	}
	
	

}
