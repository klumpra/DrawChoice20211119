import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawChoicePanel extends JPanel {
	private int shapeType;
	public int getShapeType() {
		return shapeType;
	}
	public void setShapeType(int shapeType) {
		if (shapeType < 0) {
			this.shapeType = 0;
		} else if (shapeType > 1) {
			this.shapeType = 1;
		} else {
			this.shapeType =shapeType;
		}
	}
	public DrawChoicePanel() {
		shapeType = 0;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (shapeType == 0) {
			g.fillOval(100,75,100,100);
		} else {
			g.fillRect(100,75, 100, 100);
		}
	}
}
