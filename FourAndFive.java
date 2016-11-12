package com.sd.Draw;

import java.util.ArrayList;

public class FourAndFive {
	
	ArrayList<Integer> number= new ArrayList<Integer>();
	
	
	public void setNumbers(){
		for(int i=0; i<1000;  i++){
			if(i % 4== 0 && i % 5 !=0){
				number.add(i);
			}
		}
		System.out.println(number);
	}
	
	public int sumList(){
		
		int sum=0;
		
		for(int i=0; i<number.size(); i++ ){
			
			sum = sum + number.get(i);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourAndFive ff= new FourAndFive();
		ff.setNumbers();
		System.out.println(ff.sumList());
	}

}
