package javaapp.Runner.Gameengine;


import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 50;
	private static final int height = 68;
	
	public static BufferedImage player, player2, player3, player4, room1,banner1,room2,room3,
		NoFire, Fire, TopBanner,Door, ball1, doorbanner, bomb1,stearin, stearin1;
	public static BufferedImage[] FireArray; 

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sheet.png"));
		SpriteSheet room = new SpriteSheet(ImageLoader.loadImage("/b.png"));
		SpriteSheet room_second = new SpriteSheet(ImageLoader.loadImage("/Room_Ric.png"));
		SpriteSheet room_third = new SpriteSheet(ImageLoader.loadImage("/roomdani.png"));
		SpriteSheet fire = new SpriteSheet(ImageLoader.loadImage("/FireSheet.png"));
		SpriteSheet ljus = new SpriteSheet(ImageLoader.loadImage("/sheet2.png"));
		
		
		TopBanner = ImageLoader.loadImage("/topbanner24.png");
		Door = ImageLoader.loadImage("/door.png");
		player = sheet.crop(0, 0, 52, height);
		player2 = sheet.crop(52, 0, 52, height);
		player3 = sheet.crop(2*51, 0, width, height);
		player4 = sheet.crop(3*width, 0, width, height);
		room1 = room.crop(0,0,822,668);
		room2 = room_second.crop(0,0,822,668);
		room3 = room_third.crop(0,0,822,668);
		NoFire = ImageLoader.loadImage("/NoFire.png");
		banner1 = ImageLoader.loadImage("/banner.png");
		ball1 = ImageLoader.loadImage("/ball.png");
		doorbanner = ImageLoader.loadImage("/topbannerdani.png");
		bomb1 = ImageLoader.loadImage("/bomb1.png");
		stearin = ljus.crop(4*50, 0, 52-15, height-10); 
		stearin1 = ljus.crop(5*50, 0, 52+5, height+15);
				
		
		FireArray = new BufferedImage[5];
		FireArray[0] = fire.crop(0,0,19,82);
		FireArray[1] = fire.crop(19,0,19,82);
		FireArray[2] = fire.crop(38,0,19,82);
		FireArray[3] = fire.crop(57,0,19,82);
		FireArray[4] = fire.crop(76,0,19,82);

		
		//comment
		
	}
	
}
