package com.sd.Draw;

public class LeapYear {
	
	int year;
	public LeapYear(int year){
		this.year= year;
	}
	public void computeYear(){
	
		
		if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)){
			System.out.println("a leap year");
		}else
			System.out.println("not a leap year");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear ly= new LeapYear(2016);
		ly.computeYear();
	}

}
