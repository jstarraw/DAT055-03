package javaapp.Runner.Gameengine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import javaapp.Runner.States.Victory;

public class Highscore {
	private static JFrame jframe, jframe2;
	private static JTextArea l1;
	private static Socket s;

	
/**
 * Connects to the server and receives the highscore table. Does not work properly 
 * at this moment. It works on one computer 
 * @throws IOException
 */
	public static void getHighscore() throws IOException {
		s = new Socket("127.0.0.1", 9090);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer = input.readLine();
		ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        out.writeObject(Victory.nameAndTime());
		
		l1 = new JTextArea();
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setSize(50, 300);
		jframe.add(l1);
		String replace = answer.replaceAll(",", "\n");
		l1.setText(replace);
		l1.setEditable(false);

		jframe.pack();
	}
	/**
	 *  Sends name and time to server.
	 */
	public static void sendtoserver() throws UnknownHostException, IOException {
	/*	s = new Socket("127.0.0.1", 9090);
		ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        out.writeObject(Victory.nameAndTime());*/
        
	}
}
