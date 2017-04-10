package exercise2;

public class SolidSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solid_square('*', 5);
		System.out.println();
		solid_square('=', 10);

	}
	
	public static void solid_square(char token, int side){
		for (int a = 0; a < side; a++){
			for (int b = 0; b < side; b++)
				System.out.print(token + " ");
			System.out.println();
		}
	}

}
