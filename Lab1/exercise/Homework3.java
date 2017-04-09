package exercise;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me three numbers and I will return you five!!!");
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		int sum, average, product, min, max;
		System.out.print("The first number:");
		num1 = input.nextInt();
		System.out.print("The second number:");
		num2 = input.nextInt();
		System.out.print("The third number:");
		num3 = input.nextInt();
		System.out.println("=========================");
		input.close();
		sum = num1 + num2 +num3;
		average = sum / 3;
		product = num1 * num2 * num3;
		max = Math.max(Math.max(num1, num2), num3);
		min = Math.min(Math.min(num1, num2), num3);
		System.out.printf("The sum is %d.\nThe average is %d.\nThe product is %d.\nThe largest one is %d\nThe smallest one is %d.\n", sum, average, product, max, min);
	

	}

}
