import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class DrawChoiceFrame extends JFrame {
	private DrawChoicePanel dcp;
	public void setupGUI() {
		setTitle("Draw Choice Frame");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dcp.setShapeType(0);
						repaint();
					}
				}
		);
		panSouth.add(btnCircle);
		JButton btnSquare = new JButton("Square");
		btnSquare.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dcp.setShapeType(1);
						repaint();
					}
				}
		);
		panSouth.add(btnSquare);
		c.add(panSouth,BorderLayout.SOUTH);
		dcp = new DrawChoicePanel();
		c.add(dcp,BorderLayout.CENTER);
	}
	public DrawChoiceFrame() {
		setupGUI();
	}
}
