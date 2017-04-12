package real_exercise1;

import java.util.Random;
import java.util.Scanner;

public class Coin {
	private enum side{TAILS, HEADS};
	Random ranmd = new Random();
	private Scanner input = new Scanner(System.in);
	private int Tails = 0, Heads = 0;
	
	public  side toss(){
		int i = ranmd.nextInt(2);
		side sides = ((i == 1)? side.TAILS: side.HEADS);
		System.out.println();
		return sides;
	}
	public void stat(side now){
		Tails += ((now == side.TAILS)? 1:0);
		Heads += ((now == side.HEADS)? 1: 0);		
	}
	public void display(){
		System.out.printf("Number of HEADS:\t%d\nNumber of TAILS:\t%d\n", Heads, Tails);
	}
	
	public void UI(){
		do{
		
			String info = String.format("1:\tToss Coins\n2:\tDisplay Result\n3:\tExit\nChoose an option:");
			System.out.print(info);
			int state = input.nextInt();
			if (state == 1)
				stat(toss());
			else if(state == 2)
				display();
			else if (state == 3)
				break;
		}
		while(true);
		}
		
		
	}


