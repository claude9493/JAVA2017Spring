package exercise7;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double numerator = 4;
		double denominator = 1;
		int counter = 1;
		double PI = 0;
	
		do{
			double term = numerator / denominator;
			if (counter % 2 == 1)
				PI += term;
			else
				PI -= term;
			denominator += 2;
			counter++;
		}
		while (counter < 200000);
		System.out.print(PI);

	}

}
