package Dice_Game;

import java.util.Random;

public class Dice_Game {
	public static void main(String[] args) {
		Random ran = new Random();
		for (int i = 0; i < 50; i++) {
			int num = ran.nextInt(6) + 1;
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.printf("%d ", num);
		}

	}
}
