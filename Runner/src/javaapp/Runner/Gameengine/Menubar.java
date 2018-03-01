package javaapp.Runner.Gameengine;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class Menubar {
	private JFrame frame;

	public Menubar(JFrame frame) {
		this.frame = frame;
		createMenu();
	}

	public void createMenu() {

		final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);

		JMenu fileMenu = new JMenu("GameSettings");
		menubar.add(fileMenu);

		JMenuItem openScore = new JMenuItem("Scoretable");
		// openItem.addActionListener(this);
		fileMenu.add(openScore);
		openScore.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, SHORTCUT_MASK));
		openScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreTable();
			}
		});

		JMenuItem h = new JMenuItem("Help");
		h.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, SHORTCUT_MASK));
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				helper();
			}
		});
		fileMenu.add(h);
		fileMenu.addSeparator();

		JMenuItem q = new JMenuItem("Quit");
		q.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
		q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quit();
			}
		});

		fileMenu.add(q);

		frame.setVisible(true);
		frame.pack();

	}

	public void helper() {

		JOptionPane.showMessageDialog(null,
				"  ______GAMEBUTTONS!_____\n Play = P \n Quit = Q\n Interactbutton = E\n HighScore = S\n Move-Up = w\n Move-Down = s\n Move-Left = a\n Move-Right = d\n",
				"Help message", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Quit function: quit the application.
	 */
	private void quit() {
		System.exit(0);
	}

	public void scoreTable() {

		int s = -10;

		System.out.println("The value of s is: " + -s);

	}
}
