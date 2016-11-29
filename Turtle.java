package com.sd.Draw;

public class Turtle {

	   protected int nLimb= 4 ;
	   String food;
	   

	   void setFood(String f){
	   this.food=f;
	   }
	   
	   public void eat(){
	   System.out.println("Turtle eats "+ food);
	   }
	
}
