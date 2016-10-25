package com.sd.Draw;
import ch.aplu.turtle.*;

public class DrawTriOrSq{
	Turtle t1 = new Turtle();
	enum Shape {TRIANGLE, SQUARE};
	
	public void drawTriangleOrSquare(int size,int sides,double angle){	
    t1.setHeading(90);
	
		for(int i=0;i<sides;i++){
			t1.forward(size);
			t1.left(angle);
		}
	}
	public static void main(String[] args){
		DrawTriOrSq dtos = new DrawTriOrSq();
		Shape sel = Shape.TRIANGLE;
		int size = 100;
		int sides = 0;
		double angle = 0.0;
		
		switch(sel) {
			case TRIANGLE:
				sides = 3;
				angle = 120.0;
				break;
			case SQUARE:
				sides = 4;
				angle = 90.0;
				break;
		}
		dtos.drawTriangleOrSquare(size,sides,angle);
	}
}