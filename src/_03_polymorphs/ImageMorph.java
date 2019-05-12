package _03_polymorphs;

	import java.awt.Color;
	import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
	
	public class ImageMorph extends Polymorph {
		ImageMorph(int x, int y) {
			super(x, y);
			
		}
	
		
		@Override
		public void draw(Graphics g) {
			BufferedImage image=null;
			try {
				image = ImageIO.read(new File("poly.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(image, 30, 30, 100, 100, null);
//			g.setColor(Color.green);
//			g.fillRect(getX(), getY(), 50, 50);
		}

		public void update() {
			
		}

	}


