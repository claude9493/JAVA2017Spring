package exercise1;

import java.util.Scanner;

public class O_E_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an integer");
		int n = input.nextInt();// Get n
		input.close();
		int odd_sum = 0, even_sum = 0;// initialize the two sums
		// for statement
		for (int i = 0; i <= n; i += 2) {
			even_sum += i;
		}

		int j = 1;
		do {
			odd_sum += j;
			j += 2;
		} while (j <= n);

		System.out.printf("The sum of all the odd numbers is %d.\n", odd_sum);
		System.out.printf("The sum of all the even number is %d.\n", even_sum);

	}

}
