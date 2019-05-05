package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movPoly;
	Polymorph cirPoly;
	ArrayList<Polymorph> Morph;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		
		  bluePoly = new BluePolymorph(50, 50); 
		  redPoly = new RedMorph(100,100);
		  movPoly = new MovingMorph(20,20);
		  cirPoly = new Circle(20,20);
		 
		
		 Morph = new ArrayList<Polymorph>();
		Morph.add(movPoly);
		Morph.add(redPoly);
		Morph.add(bluePoly);
		Morph.add(cirPoly);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (Polymorph poly : Morph) {
			poly.draw(g);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph poly : Morph) {
			poly.update();
		}
		
	}

}
