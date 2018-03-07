package javaapp.Runner.Room3;

import java.awt.Graphics;
import javaapp.Runner.Gameengine.Assets;

/**
 * 
 * @author nurabd
 * @Version 2018-03-01
 *
 */
public class TimeTaker {

	private boolean flagga0, flagga1, flagga2, flagga3, flagga4, flagga5, flagga6, flagga7, flagga8, flagga9, flagga10,
					flagga11, flagga12, flagga13, flagga14, flagga15;
	private int posX = 150;
	private int timerSec;
	private int timerMin;
	

	/**
	 * since the tick method in gameengine is ticking 60 time per second the render
	 * method will render an image every 60 seconds.
	 */

	public void tick() {

		timerSec++;
		timerMin++;
		timerSec();
		timermin();
		
		

	}

	/**
	 * if the flags are true the flowing assets  will draws
	 * 
	 * @param g
	 *            put the graphic object to draw
	 * 
	 */

	public void render(Graphics g) {

		if (flagga0)
			g.drawImage(Assets.siffra0, (int) posX, (int) 75, null);
		if (flagga1)
			g.drawImage(Assets.siffra1, (int) posX, (int) 75, null);
		if (flagga2)
			g.drawImage(Assets.siffra2, (int) posX, (int) 75, null);
		if (flagga3)
			g.drawImage(Assets.siffra3, (int) posX, (int) 75, null);
		if (flagga4)
			g.drawImage(Assets.siffra4, (int) posX, (int) 75, null);
		if (flagga5)
			g.drawImage(Assets.siffra5, (int) posX, (int) 75, null);
		if (flagga6)
			g.drawImage(Assets.siffra6, (int) posX, (int) 75, null);
		if (flagga7)
			g.drawImage(Assets.siffra7, (int) posX, (int) 75, null);
		if (flagga8)
			g.drawImage(Assets.siffra8, (int) posX, (int) 75, null);
		if (flagga9)
			g.drawImage(Assets.siffra9, (int) posX, (int) 75, null);
		if (flagga10) {
		
			g.drawImage(Assets.siffra0, (int) posX, (int) 75, null);
		}
		if (flagga11) {
			g.drawImage(Assets.siffra1, (int) posX - 50, (int) 75, null);
			
		}
		if (flagga12) {
		
			g.drawImage(Assets.siffra2, (int) posX - 50, (int) 75, null);
		}
		if (flagga13) {
		
			g.drawImage(Assets.siffra3, (int) posX - 50, (int) 75, null);
		}
		if (flagga14) {
			g.drawImage(Assets.siffra4, (int) posX - 50, (int) 75, null);
		}
		if (flagga15) {
			g.drawImage(Assets.siffra5, (int) posX - 50, (int) 75, null);
		}

	}
	
	/**
	 * the timer will tick every second and will indicate which flag is going 
	 * to be ticking if true or false
	 */
	
 public void timerSec() {
	int a = 60;
	if (timerSec > 0 && timerSec < a)
		flagga0 = true;
	else
		flagga0 = false;

	if (timerSec > a && timerSec < a * 2)
		flagga1 = true;
	else
		flagga1 = false;

	if (timerSec > a * 2 && timerSec < a * 3)
		flagga2 = true;
	else
		flagga2 = false;

	if (timerSec > a * 3 && timerSec < a * 4)
		flagga3 = true;
	else
		flagga3 = false;

	if (timerSec > a * 4 && timerSec < a * 5)
		flagga4 = true;
	else
		flagga4 = false;

	if (timerSec > a * 5 && timerSec < a * 6)
		flagga5 = true;

	else
		flagga5 = false;

	if (timerSec > a * 6 && timerSec < a * 7)
		flagga6 = true;
	else
		flagga6 = false;

	if (timerSec > a * 7 && timerSec < a * 8)
		flagga7 = true;
	else
		flagga7 = false;

	if (timerSec > a * 8 && timerSec < a * 9)
		flagga8 = true;
	else
		flagga8 = false;

	if (timerSec > a * 9 && timerSec < a * 10)
		flagga9 = true;
	else
		flagga9 = false;

	if (timerSec > a * 10 && timerSec < a * 20)
		flagga10 = true;
	else
		flagga10 = false;
	
	if (timerSec > 600)
		timerSec = 0;
}
 
 /**
	 * the timer will tick every Minute and will indicate which flag is going 
	 * to be ticking ,if true or false
	 */
 
 public void timermin() {
	 int a = 60;
		
		if (timerMin > a * 10 && timerSec < a * 20)
			flagga11 = true;
		else
			flagga11 = false;

		if (timerMin > a * 20 && timerSec < a * 30)
			flagga12 = true;
		else
			flagga12 = false;

		if (timerMin > a * 30 && timerSec < a * 40)
			flagga13 = true;
		else
			flagga13 = false;

		if (timerMin > a * 40 && timerSec < a * 50)
			flagga14 = true;
		else
			flagga14 = false;

		if (timerMin > a * 50 && timerSec < a * 60)
			flagga15 = true;
		else
			flagga15 = false;

 }

}
