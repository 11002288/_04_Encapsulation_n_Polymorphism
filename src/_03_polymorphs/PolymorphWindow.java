package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movPoly;
	Polymorph cirPoly;
	Polymorph foly;
	Polymorph im;
	Polymorph messly;
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
		this.addMouseListener(this);

		
		  bluePoly = new BluePolymorph(50, 50); 
		  redPoly = new RedMorph(100,100);
		  movPoly = new MovingMorph(20,20);
		  cirPoly = new Circle(200,200);
		  foly = new Follow(30,30);
		  im = new ImageMorph(150,150);
		  messly = new message(100,300);
		 
		
		 Morph = new ArrayList<Polymorph>();
		Morph.add(movPoly);
		Morph.add(redPoly);
		Morph.add(bluePoly);
		Morph.add(cirPoly);
		Morph.add(foly);
		Morph.add(messly);
		Morph.add(im);
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getPoint().x<=170||e.getPoint().x>=100) {
			if(e.getPoint().y<=370||e.getPoint().y>=300) {
				JOptionPane.showMessageDialog(null, "test");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	

}
