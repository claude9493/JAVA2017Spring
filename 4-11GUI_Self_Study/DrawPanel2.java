import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel2 extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, 1, 1);
		int step_y = height / 15, step_x = width / 15;
		for (int i = 0; i <= 15; i ++){
			int x = width / 15 * i, y = height / 15 * i;
			g.drawLine(0, y, x, height);
			g.drawLine(0,y,width - x,0);
		}
		for (int i = 15; i > 0; i--){
			int x = width - width / 15 * i, y = height / 15 * i;
			g.drawLine(width, y, x, height);
			g.drawLine(width, y, width - x, 0);
		}
		
		
		
		
	}

}
