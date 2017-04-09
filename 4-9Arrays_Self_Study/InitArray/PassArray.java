package InitArray;

public class PassArray {

	public static void main(String[] args) {
		// TODO Test the two kind of passing
//		Two methods to generate an array!!!
		int[] array = { 1, 2, 3, 4, 5 };
//		int[] array = new int[5];
		
		System.out.println(
				"Effects of passing reference to entire array :\n" + 
				"The value of the original array are:");
		
		for (int value : array)
			System.out.printf("  %d", value);
		
		modifyArray(array);
		System.out.println("\n\nThe values of the modified array are:");
		
		for (int value : array) // Enhanced for statement
			System.out.printf("  %d", value);
		
//		A great format of printing long statements
		System.out.printf(
				"\n\nEffects of passing array element value:\n" +
				"array[3] before modifyElement: %d\n", array[3]);
		
		modifyElement( array[3] );
		System.out.printf(
				"array[3] after modifyElement: %d\n", array[3]);
		
	}
//	pass_by_reference: the called method can access the arguement's value in the caller directly and modify that data if necessary
	
	public static void modifyArray(int[] array2)
	{
		for (int counter = 0; counter < array2.length; counter++)
			array2[counter] *= 2;
	}
	
//	call_by_value: a copy of the argument's value is passed to the called method
	
	public static void modifyElement(int element)
	{
		element *= 2;
		System.out.printf(
				"Values of element in modifyElement: %d\n", element);
	}

}
