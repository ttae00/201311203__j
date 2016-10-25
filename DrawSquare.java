package com.sd.Draw;

import ch.aplu.turtle.*;

public class DrawSquare {
	
	public void drawSquare(int size) {
		
		Turtle t1 = new Turtle();
		for(int i=0;i<4;i++){
			t1.forward(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		DrawSquare ds = new DrawSquare();
		ds.drawSquare(100);
	}
}