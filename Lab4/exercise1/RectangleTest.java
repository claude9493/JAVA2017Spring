package exercise1;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(2.5, 4.5);
		System.out.printf("The area of the first rectangle is %.2f.\nThe perimeter of it is %.2f.\n", rec1.area(), rec1.perimeter());
		System.out.printf("The area of the second rectangle is %.2f.\nThe perimeter of it is %.2f.\n", rec2.area(), rec2.perimeter());

	}

}
