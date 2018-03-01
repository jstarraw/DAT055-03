package javaapp.Runner.States;

import java.awt.Graphics;
import java.io.IOException;

import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;
import javaapp.Runner.Gameengine.Highscore;

public class MenuState extends States {

	private States gameState;
	private States highscore;
	private int localtimer = 10000;

	public MenuState(Gameengine game) {
		super(game);
		gameState = new Gamestate(game);
		// highscore = new Highscore(game);
	}

	@Override
	public void tick() {
		localtimer++;
		// button.getButton();
		if (game.getKeyManager().isPlay()) {
			States.setState(gameState);

		}

		if (game.getKeyManager().isQuit()) {
			System.exit(0);

		}

		if (game.getKeyManager().isHighscore() && localtimer > 10000) {
			try {
				Highscore.getHighscore();
				localtimer = 0;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.menu, (int) 0, (int) 0, null);

	}
}
