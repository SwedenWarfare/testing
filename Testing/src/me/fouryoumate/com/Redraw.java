package me.fouryoumate.com;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class Redraw extends JComponent{

		public int x = 50;
		public int y = 50;
		
		public int[] xWalls = {0,100,100};
		public int[] yWalls = {50,50,100};
		public void paint(Graphics g){
			//Top wall
			g.drawRect(0, 0, 500, 50);
			g.fillRect(0, 0, 500, 50);
			g.setColor(Color.BLACK);
			//Bottom wall
			g.drawRect(0, 410, 500, 50);
			g.fillRect(0, 410, 500, 50);
			g.setColor(Color.BLACK);
			//Side wall
			g.drawRect(xWalls[0], yWalls[0], 50, 500);
			g.fillRect(xWalls[0], yWalls[0], 50, 500);
			g.setColor(Color.GREEN);
			g.drawRect(xWalls[1], yWalls[1], 50, 100);
			g.fillRect(xWalls[1], yWalls[1], 50, 100);
			g.setColor(Color.GREEN);
			//Player
			g.drawRect(x, y, 50, 50);
		    g.fillRect(x, y, 50, 50);
		    g.setColor(Color.BLUE);
		    //Testing
		
		}
	
		public void moveLeft() {
			if(x - 5 >= 50 || x + 5 != 55) {
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
