package exercise2;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;

	enum Color {
		RED, BULE, YELLO, WHITE, BLACK
	}

	private int speed = SLOW;

	private boolean on = false;
	private double radius = 5;
	Color color = Color.BLACK;

	public Fan() {

	}

	public String toString() {
		return (this.isOn() ? String.format("Speed: %d   Color: %s   Radius: %.2f", speed, color, radius)
				: String.format("Fan is off. Color: %s   Radius: %.2f", color, radius));
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public static void main(String[] args){
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(3);
		fan1.setColor(fan1.color.YELLO);
		fan1.setRadius(10);	
		fan1.setOn(true);
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor(fan2.color.BULE);
		System.out.printf("fan1: %s\nfan2: %s",fan1.toString(),fan2.toString());
		
		
		
	}

}
