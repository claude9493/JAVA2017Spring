import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		int x = width, step = width /15;
		for (int i  = 0; i < height; i += height / 15){
			g.drawLine(0, 0, x, i);
			g.drawLine(width, height, x, i);
			x -= step;
			}
		
		int y = 0, ste = height / 15;
		for ( int i = 0; i < width; i += width / 15){
			g.drawLine(width, 0, i, y);
			g.drawLine(0, height, i, y);
			y += ste;
		}
		
		
		/*
		g.drawLine(0, 0, width, height);
		g.drawLine(0, width, height, 0);
		
		
		for (int a = 0; a < width; a += 1)
			g.drawLine(a, 0, a, height-a);
		*/

	}
}
