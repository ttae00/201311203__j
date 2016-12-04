package com.sd.Draw;


public class Circle extends Shape {
	
    private final double radius, area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius;
    }
    @Override
    public double calcArea() {
        return this.area;
    }
    @Override
    public double calcPerimeter() {
        return this.perimeter;
    }
    public String toString() {
        return "Circle..."+super.toString();
    }
    
	public static void main(String[] args){
		Circle c= new Circle(5.5);
	
		System.out.println(c.calcArea());
		System.out.println(c.calcPerimeter());
		
}
}