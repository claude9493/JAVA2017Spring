package exercise4;

public class Complex {
	private double realPart;
	private double imaginaryPart;

	public Complex() {
	};

	public Complex(double r, double i) {
		realPart = r;
		imaginaryPart = i;
	}

	public double getrealPart() {
		return realPart;
	}

	public double getimaginaryPart() {
		return imaginaryPart;
	}

	public Complex add(Complex c) {
		return new Complex(this.getrealPart() + c.getrealPart(), this.getimaginaryPart() + c.getimaginaryPart());
	}

	public static Complex add(Complex c1, Complex c2) {
		return new Complex(c1.getrealPart() + c2.getrealPart(), c1.getimaginaryPart() + c2.getimaginaryPart());
	}

	public Complex multiply(Complex c) {
		return new Complex(this.getrealPart() * c.getrealPart() - this.getimaginaryPart() * c.getimaginaryPart(),
				this.getrealPart() * c.getimaginaryPart() + this.getimaginaryPart() * c.getrealPart());
	}

	public static Complex multiply(Complex c1, Complex c2) {
		return new Complex(c1.getrealPart() * c2.getrealPart() - c1.getimaginaryPart() * c2.getimaginaryPart(),
				c1.getrealPart() * c2.getimaginaryPart() + c1.getimaginaryPart() * c2.getrealPart());
	}

	public static String toString(Complex c) {
		return String.format("%4.1f + %4.1f*i", c.getrealPart(), c.getimaginaryPart());
	}

	public static void main(String[] a) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(2, 3);
		System.out.printf("%s\n%s\n%s\n%s", toString(c1.add(c2)), toString(add(c1, c2)), toString(c1.multiply(c2)),
				toString(multiply(c1, c2)));
	}
}
