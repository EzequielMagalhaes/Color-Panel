import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quadro extends JFrame {
	private JButton bt = new JButton("Pintar");
	public Quadro() {
		super("Quadro");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pn = new JPanel();
		pn.add(bt);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
			}});
		this.setResizable(false);
		this.add(pn,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
			super.paint(g);
			for ( int i = 0; i < 50 ; i += 1) {
				g.setColor(
					new Color(
						(int)(Math.random()*256),
						(int)(Math.random()*256),
						(int)(Math.random()*256)
						));
				g.fillRect( //g.drawRect
					(int)(Math.random()*250+1),
					(int)(Math.random()*250+1),
					(int)(Math.random()*250+1),
					(int)(Math.random()*250+1)
					);
				}}
	public static void main(String[] args) {
		new Quadro();
	}
}