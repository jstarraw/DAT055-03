package javaapp.Runner.Gameengine;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * This class handles the display and makes it visible to the screen
 * 
 * @Author Daniel Cebe
 *       
 * @version 2018-03-01
 * 
 */

public class Display {

	private JFrame frame;
	private Canvas canvas;
	private String title;
	private int width, height;
	
	
	/**
	 * Constructor of the class Display
	 * Takes three parameters title, width, height and displays them
	 * Places a menubar on the frame
	 * 
	 * @param title, title of the game
	 * @param width, the width of the window size
	 * @param height the height of the window size
	 */

	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		createDisplay();
		new Menubar(frame);

	}
	
	/**
	 * 
	 * Creates the display, also the frame and makes it visible to the display
	 * 
	 */

	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);

		frame.add(canvas);
		frame.pack();

	}

	/**
	 * 
	 * Returns the surface of a defined size where the game is rendered
	 * @return canvas
	 */
	
	public Canvas getCanvas() {
		return canvas;
	}

	/** 
	 * 
	 * Returns information about the frame
	 * @return, returns the frame
	 */
	
	public JFrame getFrame() {
		return frame;
	}

}
