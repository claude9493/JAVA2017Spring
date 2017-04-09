package exercise;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args){
		System.out.println("Give me a number and I will tell you whether it is even!!!");
		Scanner input = new Scanner(System.in);
		System.out.print("The number you choose:");
		int num;
		num = input.nextInt();
		if (num % 2 == 0){
			System.out.println("It is an even number!!!");
		}
		else{
			System.out.println("It is an odd number!!!");
		}
		input.close();
	}

}
