package javaapp.Runner.Gameengine;


	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;

	public class KeyAdmin implements KeyListener {
		
		private boolean[] keys;
		public boolean up, down, left, right,interact;
		
		public KeyAdmin(){
			keys = new boolean[256];
		}
		
		public void tick(){
			up = keys[KeyEvent.VK_W];
			down = keys[KeyEvent.VK_S];
			left = keys[KeyEvent.VK_A];
			right = keys[KeyEvent.VK_D];
			interact = keys[KeyEvent.VK_E];
		}

		@Override
		public void keyPressed(KeyEvent e) {
			keys[e.getKeyCode()] = true;
		}

		@Override
		public void keyReleased(KeyEvent e) {
			keys[e.getKeyCode()] = false;
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

	}