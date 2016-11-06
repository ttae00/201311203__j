package com.sd.Draw;

public class Temperature {
	
	int freezingpoint=32;
	String symbol;
	double celsius;
	int result=0;
	
	public void writeTemperature(int temp,String[] symbol){
		
	}
	
	public void convert(int temp,String symbol){
		if(symbol.equals("F")){
			//화씨를 섭씨로 변환하는 것
		double result = (5.0/9*(temp-freezingpoint));
		System.out.println("화씨: " + temp + " 가 섭씨: " + result + "로 변환되었습니다.");
		}else if(symbol.equals("C")){
			//섭씨를 화씨로 변환하는 것
		double result =  (temp*9/5)+ freezingpoint;
		System.out.println("섭씨: " + temp + " 가 화씨: " + result + "로 변환되었습니다.");
		}else
			System.out.println("'F'와 'C'로 넣어주세요");
		
	}
	public static void main(String[] args){
		Temperature t= new Temperature();
		t.convert(30,"F");
		Temperature c= new Temperature();
		c.convert(30, "C");
		Temperature d= new Temperature();
		d.convert(4, "R");
		
	}
	
}
