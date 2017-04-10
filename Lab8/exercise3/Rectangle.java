package exercise3;

public class Rectangle {
	public static void display(int side, char token){
		for (int a = 0; a < side; a++){
			for (int b = 0; b < side; b++ )
				System.out.print(token + " ");
			System.out.println();
		}
	}
	
	public static void display(int width, int length, char token){
		for ( int a = 0; a < width; a++){
			for ( int b = 0; b < length; b++)
				System.out.print(token + " ");
			System.out.println();
		}
	}

}
