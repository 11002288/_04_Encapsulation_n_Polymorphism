package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    public int getX() {
    	return this.x;
    }
    public void setX(int num) {
    	this.x = num;
    }
    public int getY() {
    	return this.y;
    }
    public void setY(int num) {
    	this.y = num;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);


}
