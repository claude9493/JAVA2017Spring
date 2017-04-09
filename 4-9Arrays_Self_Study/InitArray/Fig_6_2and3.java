package InitArray;

public class Fig_6_2and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		create an array
		int [] array;
		array = new int[10];
//		create an array in another way
		int [] n = {10, 20, 30, 40, 50, 60};
//		use %s as place holder of strings.
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for (int counter = 0; counter < array.length; counter++){
			System.out.printf("%5d%8d\n", counter, array[counter]);
			
		}
		for (int counter = 0; counter < n.length; counter++){
			System.out.printf("%5d%8d\n", counter, n[counter]);
		}
		

	}

}
