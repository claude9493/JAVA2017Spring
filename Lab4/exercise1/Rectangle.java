package exercise1;

//import java.text.DecimalFormat;

public class Rectangle {
	private double width = 1, height = 1;	

	public Rectangle() {

	}

	public Rectangle(double iwidth, double iheight) {
		width = iwidth > 0 ? iwidth : 1;
		height = iheight > 0 ? iheight : 1;
	}

	public double get_width() {
		return width;
	}

	public double get_height() {
		return height;
	}

	public void set_width(double wid) {
		width = wid > 0 ? wid : 1;
	}

	public void set_height(double hei) {
		height = hei > 0 ? hei : 1;
	}

	public double area() {
		return  width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

}
