package com.sd.Draw;
import ch.aplu.turtle.*;

public class DrawTriangle{
	
	public void drawTriangle(int size){
		
		Turtle t1 = new Turtle();
		t1.setHeading(90);
		
		for(int i=0;i<3;i++){
			t1.forward(size);
			t1.left(120);
		}
	}
	public static void main(String[] args){
		DrawTriangle dt = new DrawTriangle();
		dt.drawTriangle(90);
	}
}