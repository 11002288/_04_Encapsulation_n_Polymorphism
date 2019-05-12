package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Polymorph {
	Circle(int x, int y) {
		super(x, y);
	}
int a = 0;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), 50, 50);
	}
	public void update() {
		
		setX((int)(100*Math.cos(a)+200));
		setY((int)(100*Math.sin(a)+100));
		a++;
		
		//setX((int) Math.cos(getX()));
	}
}
