

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		
		
		DrawPanel panel = new DrawPanel();
		
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
		
		System.out.printf("%4d\n", 12345);
		System.out.printf("%4d\n", 4);
		System.out.printf("%4d\n", 34);
		System.out.printf("%4d\n", 234);
		
		System.out.printf("%4d\n", 1234);
		

	}

}
