package com.sd.Draw;

public class Grade {
	
	String grade;
	double marks;
	
	public void computeGrade(double marks){
		
		if(90.0<=marks && marks<=100.0){
			grade="A";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}else if(80.0<=marks && marks<90.0){
			grade="B";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}else if(70.0<=marks && marks<80.0){
			grade="C";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}else if(60.0<=marks && marks<70.0){
			grade="D";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}else if(50.0<=marks && marks<60.0){
			grade="E";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}else if(marks<50.0){
			grade="F";
			System.out.println("score: "+ marks + "," +" grade is " + grade);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade g= new Grade();
		g.computeGrade(70.6);
	}

}
