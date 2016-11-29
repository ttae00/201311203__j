package com.sd.Draw;

public class SeaTurtle extends Turtle{
	
	
	Turtle turtle;
	
	public void swim(){
		System.out.println("sea turtle swims" + " using " + nLimb + " legs");
	}
	
	public static void main(String[] args){
		SeaTurtle st= new SeaTurtle();
		st.swim();
	}
}
