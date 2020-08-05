package me.fouryoumate.com;

import java.util.Random;

public class GeneratePos  {
	public static int[] xSpawn = new int[10];
	public static int[] ySpawn = new int[10];
	public GeneratePos() {
		int pos = 0;
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			pos = r.nextInt(400);
			if(xSpawn[i] == pos) {
				while(xSpawn[i] == pos) {
					pos = r.nextInt(400);
				}
				xSpawn[i] = pos;
			}else {
				xSpawn[i] = pos;
			}
				
		}
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			pos = r.nextInt(400);
			if(ySpawn[i] == pos) {
				while(ySpawn[i] == pos) {
					pos = r.nextInt(400);
				}
				ySpawn[i] = pos;
			}else {
				ySpawn[i] = pos;
			}
				
		}
		 
	}
}
