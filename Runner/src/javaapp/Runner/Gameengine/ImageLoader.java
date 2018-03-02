package javaapp.Runner.Gameengine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
 * @version 2018-03-01
 * 
 */
public class ImageLoader {
	
	
	/**
	 * 
	 *Reads the image from path  
	 * @param path, path to image
	 * @return Images  
	 */

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
