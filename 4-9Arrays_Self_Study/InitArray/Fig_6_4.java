package InitArray;

public class Fig_6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final indicates that a variable is a constant
		final int ARRAY_LENGTH = 10;
		int [] array = new int [ARRAY_LENGTH];
		
//		for structure with only one execute statement
		for (int counter = 0; counter< array.length; counter++)
			array[counter] = 2 + 2 * counter;
		
//			Place #three spaces# between the end of Index and the start of Value
			System.out.printf( "%s%8s\n", "Index", "Value");
			
//			Output the array
			for (int counter1 = 0; counter1 < array.length; counter1++){
				System.out.printf("%5d%8d\n", counter1, array[counter1]);
			}
		

	}

}
