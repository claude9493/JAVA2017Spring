package exercise5;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cel;
		double fah;
		System.out.print("Enter a degree in Celsius:");
		cel = input.nextInt();
		input.close();
		fah = (9.0/5.0) * cel + 32.0;
		System.out.printf("%d Celsius is %.1f Fahrenheit", cel, fah);
		

	}

}
