package javaapp.Runner.Gameengine;

/**
 * @Author Rickard Gyllensten, Jenny Karlsson, Roman Melnik, Daniel Cebe,
 *         Nurhusein Abdulkader
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



