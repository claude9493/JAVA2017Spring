package exercise2;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV Samsung = new TV();
		Samsung.turnOn();
		Samsung.set_Channel(15);
		Samsung.set_volume(4);
		System.out.printf("The current channel is %d.\n", Samsung.get_Channel());
		System.out.printf("The current volume is %d.", Samsung.get_volume());
	}

}
