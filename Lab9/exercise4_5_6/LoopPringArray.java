package exercise4_5_6;

public class LoopPringArray {
	public static void loopPrintArray(int[] array) {
		int length = array.length;

		for (int i = 0; i < length; i++) {

			for (int m = i; m < length; m++)
				System.out.print(array[m] + " ");

			for (int n = 0; n < i; n++)
				System.out.print(array[n] + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		loopPrintArray(ar);
	}

}
