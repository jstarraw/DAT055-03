package javaapp.Runner.Gameengine;

import java.awt.Graphics;
import java.util.Random;

public class ObjectMovements {
	
	private static int timer=0;
	private static int i = 0;
	static Random r = new Random();
	static int Low = 1;
	static int High = 4;
	static int Result = 0;
	
	public void tick()
	{
		timer++;
		
	}
	
	
	
	public void render_fire(Graphics g, int x, int y, int dif)
	{
		if(timer>7)
		{
			Result = r.nextInt(High-Low) + Low;
			timer = 0;
		}
	
		
		Result+=dif; 

		
		
		
		g.drawImage(Assets.FireArray[Result], (int) x, (int) y, null);
		Result-=dif;
			
	}
	
	

}
