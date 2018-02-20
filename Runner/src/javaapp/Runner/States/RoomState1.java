
package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Player;



public class RoomState1 extends States{
	
	private States roomstate2;
	private static boolean flagga1 = false, flagga2= false, flagga3=false, flagga4 = false,
			flagga5 = false,flagga6 = false,flagga7 = false,flagga8;
	private static int timer = 200,timer2= 0;
	private static int doorposY = 53;
	private static int i;
	
	public RoomState1(Gameengine game) {
		super(game);
		roomstate2 = new RoomState2(game);

		// TODO Auto-generated constructor stub
	}

	
	public void tick() {
		if(game.getKeyManager().isInteract())	
			pushButton();
		
		if(flagga2 && flagga5 && flagga6 && flagga7)
		{
			if(!flagga1 && !flagga3 && !flagga4 && !flagga8)
			doorposY--;
			if(Player.getYPos()< 130 && Player.getXPos()>300 && Player.getXPos() < 400)
			{
				if(game.getKeyManager().isInteract())	
					setNextRoom();

				
			}
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.room2, (int) 0, (int) 0, null);
		g.drawImage(Assets.Door, (int) 350, (int) doorposY, null);
		g.drawImage(Assets.TopBanner, (int) 337, (int) 0, null);

		renderButton(g);
	

	}
	
	public void setNextRoom() {
		
			setRoomState(roomstate2);
			Player.setYPos(650);
			Player.setXPos(300);
		
	}
	public void pushButton() {
		if(Player.getYPos() < 130 ) 
		{
			timer++;
			atButton(Player.getXPos());
		}
		
	}
	
	public void atButton(float x) {
		if(timer>15)
		{
			if(x>20 && x<90) {
				flagga1=!flagga1;
				timer=0;
			}
			
			if(x>100 && x<160) {
				flagga2=!flagga2;
				timer=0;
			}
			if(x>180 && x<230) {
				flagga3=!flagga3;
				timer=0;
			}
			if(x>250 && x<310) {
				flagga4=!flagga4;
				timer=0;
			}
			if(x>405 && x<480) {
				flagga5=!flagga5;
				timer=0;
			}
			if(x>500 && x<550) {
				flagga6=!flagga6;
				timer=0;
			}
			if(x>570 && x<650) {
				flagga7=!flagga7;
				timer=0;
			}
			if(x>660 && x<720) {
				flagga8=!flagga8;
				timer=0;
			}
		}
		
	}

	public void renderButton(Graphics g)
	{
		if(flagga1)
			renderFire(g,60);
		else
			g.drawImage(Assets.NoFire, (int) 60, (int) 65, null);
		
		if(flagga2)
			renderFire(g,140);
		else
			g.drawImage(Assets.NoFire, (int) 140, (int) 65, null);
		if(flagga3)
			renderFire(g,220);
		else
			g.drawImage(Assets.NoFire, (int) 220, (int) 65, null);
		if(flagga4)
			renderFire(g,300);
		else
			g.drawImage(Assets.NoFire, (int) 300, (int) 65, null);
		if(flagga5)
			renderFire(g,460);
		else
			g.drawImage(Assets.NoFire, (int) 460, (int) 65, null);
		if(flagga6)
			renderFire(g,540);
		else
			g.drawImage(Assets.NoFire, (int) 540, (int) 65, null);
		if(flagga7)
			renderFire(g,620);
		else
			g.drawImage(Assets.NoFire, (int) 620, (int) 65, null);
		if(flagga8)
			renderFire(g,700);
		else
			g.drawImage(Assets.NoFire, (int) 700, (int) 65, null);
		

	}
	
	/**
	 * Renders fire and animates it to make it more real.
	 * @param g the graphic object g.
	 * @param x Position of fireRender
	 */
	public void renderFire(Graphics g, int x) {
		 
		timer2++;
		if(timer2 > 15)
		{
			i++;
			timer2=0;
		}	
		if(i > 4)
			i=0;
		
		g.drawImage(Assets.FireArray[i], (int) x, (int) 65, null);

		
	}
		
		
		
	}