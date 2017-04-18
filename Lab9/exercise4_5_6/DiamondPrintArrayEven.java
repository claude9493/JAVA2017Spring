package exercise4_5_6;

public class DiamondPrintArrayEven {
	public static void diamondPrintArrayEven(int[] array) {
		int length = array.length;
		int cent = length / 2;
		// System.out.println(cent);

		for (int i = 0; i < length; i++) {
			int loc = 1;
			for (int m = i; m < length; m++) {
				if ((i <= cent - 1) && (loc >= cent - i && loc <= cent + i + 1)
						|| (i >= cent) && (loc > i - cent && loc <= length - (i - cent)))
					System.out.print(array[m] + " ");
				else
					System.out.print("  ");
				loc++;
			}

			for (int n = 0; n < i; n++) {
				if ((i <= cent - 1) && (loc >= cent - i && loc <= cent + i + 1)
						|| (i >= cent) && (loc > cent - length + i && loc < length - i + 1 + cent))
					System.out.print(array[n] + " ");
				else
					System.out.print("  ");
				loc++;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		diamondPrintArrayEven(ar);
	}

}
