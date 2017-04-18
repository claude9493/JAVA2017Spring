package exercise2;

public class ChangeTest {

	public static void main(String[] args) {
		double[] array = {1.0,2.0,3.0,5.0,1000.1,20000.1,-10,-20.2};
		for(double i : Change.change(array))
			System.out.println(i);

	}

}
