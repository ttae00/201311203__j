package com.sd.Draw;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class DrawSquareAtSave {

	public void drawSquareAtSave(){
		
		
		Turtle t2 = new Turtle();
		Double[] pos= new Double[2];
		t2.penUp();
		t2.setPos(80.0,90.0);
		t2.penDown();
	
		pos[0]=t2.getX();
		pos[1]=t2.getY();
		
		ArrayList<Double[]> posArr= new ArrayList<Double[]>();
		
		for(int i=0; i<4; i++){
			
			
			
			pos[0]=t2.getX();
			pos[1]=t2.getY();
			posArr.add(pos);
			t2.forward(100);
			t2.right(90);
			
			for(Double []p:posArr){
			
			 System.out.printf("(%.1f,%.1f)",p[0],p[1]);
			
			}
		}
	}
	
	public static void main(String[] args){
		DrawSquareAtSave dsa = new DrawSquareAtSave();
	
		dsa.drawSquareAtSave();
	
	}
}