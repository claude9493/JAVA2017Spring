package exercise6;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args){
		int radius;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius(integer) of your circle:");
		radius = input.nextInt();
		input.close();
		double pi = 3.14159;
		System.out.printf("The diameter of the circle is %d.\nThe circumference of the circle is %.2f.\nThe area of the circle is %.2f.", 2 * radius, 2 * pi * radius, pi * radius * radius);
		
	}

}
