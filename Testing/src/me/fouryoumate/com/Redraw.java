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
			g.setColor(Color.BLACK);
			//Top wall
			g.drawRect(0, 410, 500, 50);
			g.fillRect(0, 410, 500, 50);
			g.setColor(Color.BLACK);
			
			//Player
			g.drawRect(x, y, 50, 50);
		    g.fillRect(x, y, 50, 50);
		    g.setColor(Color.BLUE);
		    
		}
	
		public void moveLeft() {
			if(x - 5 >= 0) {
				x = x - 5;
				System.out.println("x: "+x); 
				System.out.println("y: "+y);
				repaint();
			}
		}
		public void moveRight() {
			if(x + 5 <= 435) {
			x = x + 5;

			System.out.println("x: "+x); 
			System.out.println("y: "+y);
			repaint();
			}
		}
		public void moveUp() {
			if(y - 5 >= 50) {
			y = y - 5;

			System.out.println("x: "+x); 
			System.out.println("y: "+y);
			repaint();
			}
		}
		public void moveDown() {
			if(y + 5 <= 360) {
			y = y + 5;

			System.out.println("x: "+x); 
			System.out.println("y: "+y);
			repaint();
			}
		}

}
