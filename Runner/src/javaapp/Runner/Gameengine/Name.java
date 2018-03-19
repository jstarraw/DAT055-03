package javaapp.Runner.Gameengine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class handles the input of a name when the game starts
 * @Author Jenny Karlsson
 *        
 * @version 2018-03-01
 * 
 */


public class Name extends JFrame {

	private JPanel jpanel = new JPanel();
	private JLabel jlabel = new JLabel();
	private JTextField jtextfield = new JTextField(25);
	private JButton jbutton = new JButton("Enter");
	private static String input;

	/** 
	 * 
	 * Constructor for the class Name that creates the name field
	 * 
	 */
	
	public Name() {
		
		playerName();
	}
	

	/**
	 * 
	 * Creates a poppup window when the game starts
	 * This poppup window is created to enter the player name 
	 * 
	 */
	
	public void playerName() {
		setTitle("Playername");
		setVisible(true);
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jpanel.add(jtextfield);

		jtextfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = jtextfield.getText();
				jlabel.setText(input);
				
			}
		});

		jpanel.add(jbutton);
		jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = jtextfield.getText();
				setVisible(false);

				setDefaultCloseOperation(EXIT_ON_CLOSE);

			}
		});

		jpanel.add(jlabel);
		add(jpanel);

	}
	
	/**
	 * This method returns the player name from the input 
	 * @return input
	 */

	public static String getPlayerId() {
		return input;
	}

}
