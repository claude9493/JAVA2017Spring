package exercise1;

public class Count {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	public static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	public static double multiply(double a, double b, double c, double d, double e) {
		return a * b * c * d * e;
	}

	public static double multiply(double... numbers) {
		double product = 1.0;
		for (double num : numbers)
			product *= num;
		return product;
	}

}
