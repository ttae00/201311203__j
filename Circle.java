package com.sd.Draw;

public class Circle extends Point {
	
	Circle(int x,int y,double radius){
		
		super.x=x;
		super.y=y;
	}
	
	double radius=5.0;
	
	double getArea(){
		return Math.PI * radius * radius;
		
	}
	public static void main(String[] args){
		Circle c= new Circle(10,10,5);
		System.out.println(c.getArea());
	}
}
