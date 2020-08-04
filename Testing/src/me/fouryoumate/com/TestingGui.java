package me.fouryoumate.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TestingGui extends JFrame implements KeyListener {
	Redraw draw = new Redraw();
//	DrawWalls walls = new DrawWalls();
	static int x = 50;
	static int y = 50;
	JFrame frame = new JFrame();
	public TestingGui() {
		 addKeyListener(this);
		 //Set JFrame size
		 setSize(500,500);
		 getContentPane().add(draw);
		 
		 //Make JFrame visible
		 setVisible(true);
	}
	 
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:
			draw.moveLeft();
		
			break;
		case KeyEvent.VK_D:
			draw.moveRight();
			break;
		case KeyEvent.VK_W:
			draw.moveUp();
			break;
		case KeyEvent.VK_S:
			draw.moveDown();
			break;
		default:
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
