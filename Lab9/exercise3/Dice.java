package exercise3;

import java.util.Random;

public class Dice {
	int[] stat = new int[11];
	
	public void init(){
		for(int i = 0; i < 11; i++){
			this.stat[i] = 0;
			System.out.print( stat[i] + " \t " );
		}
		System.out.println();
		System.out.println("Successfully initialize!!!");
		
	}
	
	public void roll(){
		Random rand = new Random();
		for ( int i = 0; i < 36000000; i ++)
			stat[rand.nextInt(6)+1 + rand.nextInt(6) + 1 -2]++;
	}
	
	public void display(){
		for ( int i : stat)
			System.out.print(i + "\t");
		System.out.println();
	}

}
