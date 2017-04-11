import javax.swing.JFrame;

public class Que4_1 {
	public static void main(String[] args){
		JFrame application = new JFrame();
		DrawPanel  panel = new DrawPanel();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
		
		JFrame app2 = new JFrame();
		DrawPanel2 pan = new DrawPanel2();
		app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app2.add(pan);
		app2.setSize(300, 300);
		app2.setVisible(true);
		
		
	}

}
