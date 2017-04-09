package exercise6;

public class Nine_Nine_Multiplication_Table {

	public static void main(String[] args) {
		// To solve this problem, we use two layers of repetition.
		// formation is j*i = blabla
		
		for (int i = 1; i < 10; i++){
			for (int j = 1; j <= i; j++){
				System.out.printf("%d*%d = %d  ", j, i, j * i);
			}
			System.out.println();
		}
		

	}

}
