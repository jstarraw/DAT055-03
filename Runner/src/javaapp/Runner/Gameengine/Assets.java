package javaapp.Runner.Gameengine;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 50;
	private static final int height = 68;

	private static final int widthJenny = 32, heightJenny = 32;

	public static BufferedImage doorbanner, bomb1, stearin, stearin1, player, player2, player3, player4, room1, banner1,
			room2, room3, room4, room5, NoFire, Fire, TopBanner, Door, ball1, arrow, brokenarrow, menu, room6, bubble,
			win, gameover,
			// doors for room3
			door1, door2,
			// "timer" room 3
			siffra1, siffra2, siffra3, siffra4, siffra5, siffra6, siffra7, siffra8, siffra9, siffra0, streetlight,

			// jenny

			banana, icecream, icecream2, chocolate, candyKane, trap;

	public static BufferedImage[] FireArray;

	public static void init() {
		
		//SpriteSheets
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sheet.png"));
		SpriteSheet fire = new SpriteSheet(ImageLoader.loadImage("/FireSheet.png"));
		SpriteSheet jennysheet = new SpriteSheet(ImageLoader.loadImage("/jennysheet.png"));
		SpriteSheet ljus = new SpriteSheet(ImageLoader.loadImage("/sheet2.png"));

		// jenny
		banana = jennysheet.crop(widthJenny * 3, 0, widthJenny, heightJenny);
		trap = jennysheet.crop(widthJenny * 2, 0, widthJenny, heightJenny);
		icecream = jennysheet.crop(widthJenny, heightJenny, widthJenny, heightJenny);
		icecream2 = jennysheet.crop(widthJenny * 2, heightJenny, widthJenny, heightJenny);
		chocolate = jennysheet.crop(0, heightJenny, widthJenny, heightJenny);
		candyKane = jennysheet.crop(0, 0, widthJenny, heightJenny);

		//Rooms
		room2 = ImageLoader.loadImage("/Room_Ric.png");
		room3 = ImageLoader.loadImage("/roomdani.png");
		room4 = ImageLoader.loadImage("/Room3_back.png");
		room5 = ImageLoader.loadImage("/Room_Foo2.png");
		room6 = ImageLoader.loadImage("/room5.png");
		
		// will work as time taker in room 3
		SpriteSheet siffror = new SpriteSheet(ImageLoader.loadImage("/Room3_Timer.png"));
		SpriteSheet Doors = new SpriteSheet(ImageLoader.loadImage("/Room3_Doors.png"));

		// Roman's room

		bubble = ImageLoader.loadImage("/bubble.png");
		win = ImageLoader.loadImage("/win.png");
		gameover = ImageLoader.loadImage("/gameover.png");

		TopBanner = ImageLoader.loadImage("/topbanner24.png");
		Door = ImageLoader.loadImage("/door.png");
		
		//Player
		player = sheet.crop(0, 0, 52, height);
		player2 = sheet.crop(52, 0, 52, height);
		player3 = sheet.crop(2 * 53, 0, width, height);
		player4 = sheet.crop(152, 0, 47, height);
		

		NoFire = ImageLoader.loadImage("/NoFire.png");
		banner1 = ImageLoader.loadImage("/banner.png");
		arrow = ImageLoader.loadImage("/arrrow50.png");
		brokenarrow = ImageLoader.loadImage("/arrrow50broken.png");
		menu = ImageLoader.loadImage("/menu.png");
		ball1 = ImageLoader.loadImage("/ball.png");
		doorbanner = ImageLoader.loadImage("/topbannerdani.png");
		bomb1 = ImageLoader.loadImage("/bomb1.png");
		stearin = ljus.crop(4 * 50, 0, 52 - 15, height - 10);
		stearin1 = ljus.crop(5 * 50, 0, 52 + 5, height + 15);

		//Animated fire
		FireArray = new BufferedImage[5];
		FireArray[0] = fire.crop(0, 0, 19, 82);
		FireArray[1] = fire.crop(19, 0, 19, 82);
		FireArray[2] = fire.crop(38, 0, 19, 82);
		FireArray[3] = fire.crop(57, 0, 19, 82);
		FireArray[4] = fire.crop(76, 0, 19, 82);

		// comment

		// comment

		/*
		 * siffra1 = siffror.crop(0, 0, 2 * width, 2 * height); siffra2 = siffror.crop(2
		 * * width, 0, 2 * width, 2 * height); siffra3 = siffror.crop(4 * width, 0, 2 *
		 * width, 2 * height); siffra4 = siffror.crop(6 * width, 0, 2 * width, 2 *
		 * height); siffra5 = siffror.crop(0, 2 * height, 2 * width - 18, 2 * height);
		 * siffra6 = siffror.crop(2 * width - 18, 2 * height - 36, 2 * width - 18, 2 *
		 * height - 36); siffra7 = siffror.crop(4 * width - 18, 2 * height - 36, 2 *
		 * width - 18, 2 * height - 36); siffra8 = siffror.crop(6 * width - 18, 2 *
		 * height - 36, 2 * width - 18, 2 * height - 36); siffra9 = siffror.crop(0, 4 *
		 * height - 36, 2 * width - 18, 2 * height - 36); siffra0 = siffror.crop(0, 6 *
		 * height - 36, 2 * width - 18, 2 * height - 36);
		 * 
		 * door1 = Doors.crop(4 * width, 0, width * 2, height * 4); door2 = Doors.crop(6
		 * * width, 0, width * 2, height * 4);
		 * 
		 */

		streetlight = Doors.crop(width, height, width, height);
	}

}
