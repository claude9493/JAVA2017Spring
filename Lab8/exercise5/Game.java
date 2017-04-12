package exercise5;

import java.util.Random;
import java.util.Scanner;

public class Game {
	 // input answer and return the decision whether the answer is right
	static Scanner input = new Scanner(System.in);
	
	public static boolean Try(int real_answer) {
		int answer = input.nextInt();
		return (answer == real_answer ? true : false);
		// <using for test>System.out.println(answer == real_answer? "True": "False");
		// input.close(); WHY this statement cannot be used ??? once I remove
		// the comment token, the complier gives an exception!!		
	}

	// one value
	public static void playgame(int a) {
		boolean result = false;
		int que = a * a;
		do {
			result = Try(que);
			// System.out.println();
		} while (result != true);
		System.out.println("Congratulations");

	}

	// two values
	public static void playgame(int a, int b) {
		boolean result = false;
		do {
			result = Try(a * b);
		} while (result != true);
		System.out.println("Congratulations");
	}

	// three values
	public static void playgame(int a, int b, int c) {
		boolean result = false;
		do {
			result = Try(a + b + c);
		} while (result != true);
		System.out.println("Congratulations");
	}

	// play
	public static void play(int a, int b, int c) {
		Random randomnumber = new Random();
		int choice = randomnumber.nextInt(3) + 1;
		// System.out.println(choice);
		switch (choice) {
		case 1:
			playgame(random_one_number(a, b, c));
			break;
		case 2:
			switch (randomnumber.nextInt(3) + 1) {
			
			case 1:
				playgame(b, c);
				break;
				
			case 2:
				playgame(a, c);
				break;
			case 3:
				playgame(a, b);
				break;
			}
			break;
			
		case 3:
			playgame(a, b, c);
			break;
			
		}
		input.close();

	}

	public static int random_one_number(int a, int b, int c) {
		Random ran = new Random();
		int index = ran.nextInt(3) + 1;
		return (index == 1 ? a : index == 2 ? b : c);
	}

}
