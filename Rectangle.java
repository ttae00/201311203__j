package com.sd.Draw;

public class Rectangle extends Shape {
	
	 private final double width, height, area, perimeter;
	 Shape shape;

	
	 public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width=width;
		this.height= height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
		
	}
	
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.area;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return this.perimeter;
	}
	
	public String toString(){
		return "Rectangle..."+super.toString();
	}
	
	public static void main(String[] args){
		Rectangle rect= new Rectangle(10.0, 10.5);
	
		System.out.println(rect.calcArea());
		System.out.println(rect.calcPerimeter());
		
		
	}
	
}
