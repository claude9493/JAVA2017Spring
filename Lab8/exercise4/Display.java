package exercise4;

public class Display {
//	one arguments
	public static void triangle(int num){
		for (int a = 1; a <= num; a++){
			for (int b = 1; b <= 2 * num -1; b++)
				if (b <= num - a || b >= a + num)
					System.out.print(" ");
				else
					System.out.print(a);
			System.out.println();//change line
		}
	}
//	two arguments
	public static void triangle(int num, char token){
		for (int a = 1; a <= num; a++){
			for (int b = 1; b <= 2 * num - 1; b++)
				if (b <= num - a || b >= num + a)
					System.out.print(" ");
				else
					System.out.print(token);
			System.out.println();
		}
	}

}
