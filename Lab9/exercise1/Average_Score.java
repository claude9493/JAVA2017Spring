package exercise1;

import java.util.Scanner;

public class Average_Score {

	public static void main(String[] args) {
		int[] score = new int[10];
		System.out.println("please input ten scores between 0 and 100:");
		Scanner input = new Scanner(System.in);
		int n = 0;
		int max = -1, min = 101;
		
		do{
			score[n] = input.nextInt();
			
			if (score[n] > 100 || score[n] < 0)
				System.out.println("This score is illeagle!");
			else
			{
			max = score[n] > max ? score[n]: max;
			min = score[n] < min ? score[n]: min;
			n++;
			}
		}while (n < score.length);
		
		input.close();
		n = 0;
		for (int i: score)
			n += i;
		System.out.println((double) (n-max-min)/8 );
		
		
	}

}
