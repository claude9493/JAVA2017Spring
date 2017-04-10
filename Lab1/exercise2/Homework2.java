package exercise2;

import java.util.Scanner;
//Shift + Ctrl + O = autoimport

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please input two integers, and I will output their sum, product, difference and quotient :)");
		int num1, num2;
		System.out.print("The first number:");
		num1 = input.nextInt();
		System.out.print("The second number:");
		num2 = input.nextInt();
		input.close();
		System.out.println("==================================");
		System.out.printf("The sum of them is %d.\n", num1 + num2);
		System.out.printf("The product of them is %d.\n", num1 * num2);
		System.out.printf("The difference of them(the first one substracts the second one ) is %d.\n", num1 - num2);
		System.out.printf("The quotient of them(the first one divides the second one) is %d.\n:)", num1 / num2);

	}

}
