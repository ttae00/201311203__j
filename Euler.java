package com.sd.Draw;
import java.util.Calendar;


public class Euler {
	
	
	
	Calendar cal = Calendar.getInstance();
	int Day;
	int num;
	int year;
	int result = 0;
	int day_of_week;
	
	public void computeEuler(){
	
		for(int year  = 1901; year < 2001; year++){
			for(int month = 1; month <= 12; month++){
				if(month == 2){
					if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0) == true){
						Day =29;
					}else{
						Day =28;
					}
					
				}else if(month == 4 || month == 6 || month == 9 || month == 11){
					Day = 30;
				}else{
					Day = 31;
				}
				
				cal.set(year, month, Day);
				day_of_week = cal.get(cal.DAY_OF_WEEK);
				
				if(day_of_week == 1){
					result += 1;
				}
			}
		}
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Euler eu= new Euler();
	eu.computeEuler();
	}

}
