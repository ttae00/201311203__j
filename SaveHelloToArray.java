package com.sd.Draw;

public class SaveHelloToArray {
	
	public static void main(String[] args){
	Hello[] h= new Hello[2];
	
	h[0]= new Hello("kty");
	h[1]= new Hello("kts");
	
	for(Hello e:h){
		
		e.sayHello();

	
	}
	}
}
