package javaapp.Runner.States;

import java.awt.Graphics;
/*import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
*/
import javaapp.Runner.Gameengine.Assets;
import javaapp.Runner.Gameengine.Gameengine;

public class Highscore extends States {

	private MenuState menuState;
	private Gameengine game;

	public Highscore(Gameengine game) {
		super(game);
		this.game = game;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

		g.drawImage(Assets.TopBanner, (int) 337, (int) 0, null);

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		States.setState(menuState);

		if (game.getKeyManager().isEsc()) {
			menuState = new MenuState(game);
			States.setState(menuState);

		}
	}

}
