package javaapp.Runner.Gameengine;

/**
 * This class is the main program that starts the gameenigne and makes it ready to play the game
 * @Author Roman Melnik
 * @version 2018-03-01
 * 
 */


public class Start {



	/**
	 * Starts the game, works like a main program 
	 * @param String, takes a string(the title of the game) and two more parameters(the width and height)
	 * 
	 */

	public static void main(String[] args) {
		Name name = new Name();
		Gameengine game = new Gameengine("Runner", 822, 668);
		game.start();
	}
}



