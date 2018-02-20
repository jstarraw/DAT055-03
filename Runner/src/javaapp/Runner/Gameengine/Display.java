package javaapp.Runner.Gameengine;


	import java.awt.Canvas;
	import java.awt.Dimension;
	import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;

	import javax.swing.JFrame;
	import javax.swing.*;




	public class Display {

		private JFrame frame;
		private Canvas canvas;
		
		private String title;
		private int width, height;
		
		public Display(String title, int width, int height){
			this.title = title;
			this.width = width;
			this.height = height;
			
			createDisplay();
			createMenu();
		}
		
		private void createDisplay(){
			frame = new JFrame(title);
			frame.setSize(width, height);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			canvas = new Canvas();
			canvas.setPreferredSize(new Dimension(width, height));
			canvas.setMaximumSize(new Dimension(width, height));
			canvas.setMinimumSize(new Dimension(width, height));
			canvas.setFocusable(false);
			
			frame.add(canvas);
			frame.pack();
			
		}
		
		
	
				 
		public void createMenu() {		

				
				final int SHORTCUT_MASK =
			            Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

				 JMenuBar menubar = new JMenuBar();
			     frame.setJMenuBar(menubar);

			     JMenu fileMenu = new JMenu("GameSettings");
			     menubar.add(fileMenu);

			        JMenuItem openScore = new JMenuItem("Scoretable");
			        //openItem.addActionListener(this);
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
			    System.out.println("How can i help you");
			   
			}

			/**
			 * Quit function: quit the application.
			 */
			private void quit()
			{
			    System.exit(0);
			}

			public void scoreTable(){

			    int s = -10;

			    System.out.println("The value of s is: " +-s);

			}


			
		

		public Canvas getCanvas(){
			return canvas;
		}
		
		public JFrame getFrame(){
			return frame;
		}
		
	}


