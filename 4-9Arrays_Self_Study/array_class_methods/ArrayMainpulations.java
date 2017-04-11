package array_class_methods;

import java.util.Arrays;
//import java.util.ArrayList;

public class ArrayMainpulations {

	public static void main(String[] args) {
//		ArrayList e= new ArrayList<String>();
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4 };
//		SORT array
		Arrays.sort(doubleArray);
		System.out.printf("\ndoubleArray: ");
		for (double value : doubleArray)
			System.out.printf("%.1f ", value);
//		FILL array
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 666);
		displayArray(filledIntArray, "filledIntArray");
//		COPY array
		int[] intArray = {1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
//		EQUALS or not for array
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("\n\nintArray %s intArrayCopy\n", 
				(b? "==": "!="));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray", 
				(b? "==": "!="));
//		BINARY_SEARCH array
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 0)
			System.out.printf("Found 5 at element %d in intArray\n", location);
		else
			System.out.println("5 is not found in intArray");
		
		location = Arrays.binarySearch(intArray, 8793);
		
		if(location >= 0)
			System.out.printf("Found 8793 at element %d in intArray", location);
		else
			System.out.println("8793 is not found in intArray");

	}
//	display array index and value
	public static void displayArray( int[] array, String description)
	{
		System.out.printf("\n%s: ", description);
		for(int value : array)
			System.out.printf("%d  ", value);
	}

}
