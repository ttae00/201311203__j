package com.sd.Draw;
import ch.aplu.turtle.*;


public class DrawStar{
	
	
	public void drawStar(int size){
		
		Turtle t1 = new Turtle();
		t1.setHeading(90);
		for(int i=0;i<5;i++){
			t1.forward(size);
			t1.right(145);
		}
	}
	public static void main(String[] args){
		DrawStar ds = new DrawStar();
		ds.drawStar(130);
	}
}