package exercise;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a number consisting of five digits:");
		num = input.nextInt();
		input.close();
		int dig1, dig2, dig3, dig4, dig5;
		if ( (num - num % 10000) / 10000 > 9){
			System.out.println("More Than Five Digits!!!");
		}
		else if((num - num % 1000) / 1000 < 10){
			System.out.println("Fewer Than Five Digits!!!");
		}
		else{  
			dig1 = (num - num % 10000)/10000;//4
			dig2 = (num - num % 1000)/1000 - dig1 * 10;//2
			dig3 = (num - num % 100)/100 - dig1 * 100 - dig2 * 10;//3
			dig4 = (num - num % 10)/10 - dig1 * 1000 - dig2 * 100 - dig3 * 10 ;//3
			dig5 = num - dig1 * 10000 - dig2 * 1000 - dig3 * 100 - dig4 * 10;//9
			System.out.printf("%d %d %d %d %d", dig1, dig2, dig3, dig4, dig5);
		}

	}

}
