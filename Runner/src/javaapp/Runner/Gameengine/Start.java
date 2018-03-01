package javaapp.Runner.Gameengine;

public class Start {

	public static void main(String[] args) {
		Name name = new Name();
		name.playerName();
		
		Gameengine game = new Gameengine("Runner", 822, 668);
		game.start();
	}

}
