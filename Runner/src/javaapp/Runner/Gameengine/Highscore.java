package javaapp.Runner.Gameengine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import javaapp.Runner.States.Victory;

public class Highscore {
	private static JFrame jframe, jframe2;
	private static JTextArea l1;

	public static void getHighscore() throws IOException {
		Socket s = new Socket("127.0.0.1", 9090);
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
}
