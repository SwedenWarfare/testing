package me.fouryoumate.com;

import java.awt.Graphics;

import javax.swing.JFrame;

public class TestingGui extends JFrame{
	JFrame frame = new JFrame();
	public TestingGui() {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 //Set JFrame size
		 setSize(500,500);

		 //Make JFrame visible
		 setVisible(true);
	}
	public void paint (Graphics g) {
		
	}
}
