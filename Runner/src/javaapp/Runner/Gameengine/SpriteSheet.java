package javaapp.Runner.Gameengine;

import java.awt.image.BufferedImage;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */


public class SpriteSheet {

	private BufferedImage sheet;
	
	/**
	 * 
	 * Constructor of the class SpriteSheet
	 * @param sheet
	 */

	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	/**
	 * Allows the player to crop an image.
	 * @param x X is the offset for the crop to start
	 * @param y Y is the offset for the crop to start
	 * @param width width is the width you want the image to be
	 * @param height height is the height of thet image 
	 * @return
	 */
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y, width, height);
	}

}
