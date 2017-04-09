package InitArray;

public class EnhancedForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
//		Enhanced for statement: for (parameter : arrayName) \n statement
		for (int number: array)
			total += number;
		
		System.out.printf("Total of array elements: %d\n", total);
			

	}

}
