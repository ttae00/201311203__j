package com.sd.Draw;

public class BMI {
	
	double bmi;
	double weight;
	double height;
	public void compute(double weight, double height){
		this.weight=weight;
		this.height=height;
		this.bmi = weight/(height *height);
		
	}
	
	public void computeBMI(){
		if(bmi<=18.5){
			System.out.println("low");
		}else if(18.5<bmi && bmi<=23){
			System.out.println("normal");
		}else if(23<bmi && bmi<=25){
			System.out.println("risky");
		}else if(25<bmi && bmi<=30){
			System.out.println("obesity 1");
		}else if(30<bmi && bmi<=40){
			System.out.println("obesity 2");
		}else if(bmi>40){
			System.out.println("obesity 3");
		}else
			System.out.println("error");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI bmi= new BMI();
		bmi.compute(100.0, 1.7);
		bmi.computeBMI();
	}

}
