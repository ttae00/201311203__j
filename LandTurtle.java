package com.sd.Draw;

public class LandTurtle extends Turtle {
	
	Turtle turtle;
	
	
	public void walk(){
		   System.out.println("LandTurtle walk "+ "with "+ nLimb + " legs");
	}
	
	public static void main(String[] args){
		
		LandTurtle lt= new LandTurtle();
		lt.walk();
	}
}
