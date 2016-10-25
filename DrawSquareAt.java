package com.sd.Draw;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class DrawSquareAt {
	public void drawSquareAt(int size,double x,double y){
		
		Turtle t1 = new Turtle();
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
		
		for(int i=0; i<4; i++){
			t1.forward(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		DrawSquareAt dsa = new DrawSquareAt();
		Point2D p1 = new Point2D.Double(100.0,100.0);
		dsa.drawSquareAt(70,p1.getX(),p1.getY());
	}
}