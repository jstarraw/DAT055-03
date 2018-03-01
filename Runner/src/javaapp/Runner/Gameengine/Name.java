package javaapp.Runner.Gameengine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Name extends JFrame {
	
	 private  JPanel jpanel = new JPanel();
     private  JLabel jlabel = new JLabel();
     private JTextField jtextfield = new JTextField(25);
     private JButton jbutton = new JButton("Enter");
     private static String input;
	
	
	

	       public void playerName()
	       {
	              setTitle("Playername");
	              setVisible(true);
	              setSize(400, 100);
	              setDefaultCloseOperation(EXIT_ON_CLOSE);

	              jpanel.add(jtextfield);


	              jtextfield.addActionListener(new ActionListener()
	              {
	                     public void actionPerformed(ActionEvent e)
	                     {
	                           input = jtextfield.getText();
	                           jlabel.setText(input); 
	                     }
	              });

	              jpanel.add(jbutton);
	              jbutton.addActionListener(new ActionListener()
	              {
	                      public void actionPerformed(ActionEvent e)
	                      {
	                            input = jtextfield.getText();
	          	              	setVisible(false);

	          	              	setDefaultCloseOperation(EXIT_ON_CLOSE);

	                      }
	              });
	              
	              jpanel.add(jlabel);
	              add(jpanel);

	       }
	       
	       public String getName() {
	    	   return input;
	       }
	
		
		
		
		
}
