package javaapp.Runner.States;

import java.awt.Graphics;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;

public class MenuState extends States {

	private States gameState;
	private States highscore;

	public MenuState(Gameengine game) {
		super(game);
		gameState = new Gamestate(game);
		highscore = new Highscore(game);
	}

	@Override
	public void tick() {

		// button.getButton();
		if (game.getKeyManager().isPlay()) {
			States.setState(gameState);

		}

		if (game.getKeyManager().isQuit()) {
			System.exit(0);

		}

		if (game.getKeyManager().isHighscore()) {
			States.setState(highscore);

		}

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.menu, (int) 0, (int) 0, null);

	}
}
