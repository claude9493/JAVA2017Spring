package exercise4_5_6;

public class DiamondPrintArrayOdd {

	public static void diamondPrintArrayOdd(int[] array) {
		int length = array.length;
		int cent = length / 2 + 1;
		// System.out.println(cent);

		for (int i = 0; i < length; i++) {
			int loc = 1;
			for (int m = i; m < length; m++) {
				if ((i <= cent - 1) && (loc >= cent - i && loc <= cent + i)
						|| (i >= cent) && (loc > i - cent + 1 && loc <= length - (i - cent + 1)))
					System.out.print(array[m] + " ");
				else
					System.out.print("  ");
				loc++;
			}

			for (int n = 0; n < i; n++) {
				if ((i <= cent - 1) && (loc >= cent - i && loc <= cent + i)
						|| (i >= cent) && (loc >= cent - length + i + 1 && loc <= length - i - 1 + cent))
					System.out.print(array[n] + " ");
				else
					System.out.print("  ");
				loc++;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		diamondPrintArrayOdd(ar);
	}

}
