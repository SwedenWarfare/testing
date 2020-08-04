package me.fouryoumate.com;

import java.util.Random;

public class GeneratePos  {
	public static int[] xSpawn = new int[10];
	public static int[] ySpawn = new int[10];
	public GeneratePos() {
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			xSpawn[i] = r.nextInt(50); 
		}
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			ySpawn[i] = r.nextInt(50); 
		}
		 
	}
}
