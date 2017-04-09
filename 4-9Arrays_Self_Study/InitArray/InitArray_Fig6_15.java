package InitArray;
// How to pass command-line arguments in eclipse???
// --> Run Configurations(inside the run button[an white tangle in a green circle] list) 
// --> Arguments
// --> Program arguments

public class InitArray_Fig6_15 {

	public static void main(String[] args) {
//		determine the number of args used
		if (args.length != 3)
			System.out.println("Error: Please re-enter the entire command, including \n"
					+ "an array size, initial value and increment");
		else {
//			transfer the args into integer type and store them in individual variables
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];//create an array
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
//			complete the array by loop
			for (int counter = 0; counter < array.length; counter++)
				array[counter] = initialValue + increment * counter;
//			output the list
			System.out.printf("%s%8s\n", "Index", "Value");
			for (int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%8d\n", counter, array[counter]);
		}

	}

}
