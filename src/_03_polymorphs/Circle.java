package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Polymorph {
	Circle(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), 50, 50);
	}
	public void update() {
		setX(getX()+10);
		//setX((int) Math.cos(getX()));
	}
}
