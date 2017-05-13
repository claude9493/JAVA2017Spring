package exercise3;

import static java.lang.Math.*;


import java.util.Scanner;

public class Polygon {

	public static void main(String[] ar) {
		System.out.print("Enter the number of sides: ");
		Scanner input = new Scanner(System.in);
		int sides_num = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		input.close();
		double Area = (sides_num * pow(side, 2)) / (4 * tan((double) PI / sides_num));
		System.out.printf("The area of the polygon is %.3f",Area);
	}

}
