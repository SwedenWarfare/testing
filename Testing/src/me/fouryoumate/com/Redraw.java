package me.fouryoumate.com;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class Redraw extends JComponent{

		public int x = 50;
		public int y = 50;
		 
		public void paint(Graphics g){
			//Top wall
			g.drawRect(0, 0, 500, 50);
			g.fillRect(0, 0, 500, 50);
			g.setColor(Color.GREEN);
			//Top wall
			g.drawRect(0, 400, 500, 50);
			g.fillRect(0, 400, 500, 50);
			g.setColor(Color.GREEN);
			
			//Player
			g.drawRect(x, y, 50, 50);
		    g.fillRect(x, y, 50, 50);
		    g.setColor(Color.GREEN);
		    
		}
	
		public void moveLeft() {
			x = x - 5;
			 
			repaint();
		}
		public void moveRight() {
			x = x + 5;
			 
			repaint();
		}
		public void moveUp() {
			 
			y = y - 5;
			repaint();
		}
		public void moveDown() {
		 
			y = y + 5;
			repaint();
		}

}
