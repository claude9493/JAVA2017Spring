package InitArray;

import java.util.Random;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();//Random number generator
		int[] frequency = new int[7];//array of frequency counter
//		roll 6000 times
		for (int roll = 1; roll <= 6000; roll++)
			++frequency[1 + randomNumber.nextInt(6)];

		System.out.printf("%s%10s\n", "Face", "Frequency");

		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d\n", face, frequency[face]);
		

	}

}
