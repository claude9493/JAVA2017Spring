package real_exercise1;

import java.util.Random;
import java.util.Scanner;

public class Coin {
//	enum type:	side
	private enum side{TAILS, HEADS};
	
//	random number generator
	Random ranmd = new Random();
	private Scanner input = new Scanner(System.in);
	
//	counter
	private int Tails = 0, Heads = 0;
	
//	toss coin
	public  side toss(){
		int i = ranmd.nextInt(2);
		side sides = ((i == 1)? side.TAILS: side.HEADS);
		System.out.println();
		return sides;
	}
//	count sides info
	public void stat(side now){
		Tails += ((now == side.TAILS)? 1:0);
		Heads += ((now == side.HEADS)? 1: 0);		
	}
//	2.display current information
	public void display(){
		System.out.printf("Number of HEADS:\t%d\nNumber of TAILS:\t%d\n", Heads, Tails);
	}
//	User Interface...
	public void UI(){
		do{
		
			String info = String.format("1:\tToss Coins\n2:\tDisplay Result\n3:\tExit\nChoose an option:");
			System.out.print(info);//print info every time
//			input the choose number
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


