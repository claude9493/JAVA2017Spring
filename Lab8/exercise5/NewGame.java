package exercise5;

import java.util.Random;
import java.util.Scanner;

public class NewGame {
//	random number generator and Scanner
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
//	main part of program
	public void begin_game() {
		int num = rand.nextInt(3) + 1;
		switch (num) {
		case 1:
			playgame(rand.nextInt(10) + 1);
			break;
		case 2:
			playgame(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
			break;
		case 3:
			playgame(rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10) + 1);
			break;
		}
		System.out.println("Congratulations!!!");
	}
//	one argument
	public void playgame(int n) {
		do {
			System.out.println(n);
			int answer = input.nextInt();
			if (answer == n * n)
				break;
		} while (true);
	}
//	two arguments
	public void playgame(int n, int m) {
		do {
			System.out.println(n + " x " + m);
			int answer = input.nextInt();
			if (answer == n * m)
				break;
		} while (true);
	}
//	three arguments
	public void playgame(int a, int b, int c) {
		do {
			System.out.printf("%d + %d + %d\n", a, b, c);
			int answer = input.nextInt();
			if (answer == a + b + c)
				break;
		} while (true);
	}

}
