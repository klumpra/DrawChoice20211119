import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawChoiceFrame extends JFrame {
	public void setupGUI() {
		setTitle("Draw Choice Frame");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JButton btnCircle = new JButton("Circle");
		panSouth.add(btnCircle);
		JButton btnSquare = new JButton("Square");
		panSouth.add(btnSquare);
		c.add(panSouth,BorderLayout.SOUTH);
		DrawChoicePanel dcp = new DrawChoicePanel();
		c.add(dcp,BorderLayout.CENTER);
	}
	public DrawChoiceFrame() {
		setupGUI();
	}
}
