package exercise8;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a postive integer");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int counter = 0;
//		System.out.print("1\t");
		
		for (int i = 2; i <= n; i++){
			int judge = 0;
			
			for (int j = 2; j < i; j++){
				 if (i % j == 0){
					 judge = 1;
					 break;
				 }
				 					 
			 }
			
			if (judge == 0){
				System.out.printf("%d\t", i);
				counter++;
			}
				
		}
		System.out.printf("\nThere are %d prime numbers from 1 to %d.", counter, n);
	}

}
