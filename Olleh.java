package com.sd.Draw;

public class Olleh {
	
	
	String hello= "hello";
	char[] chArr= hello.toCharArray();
	
	
	public void flip(){
		
		StringBuilder olleh= new StringBuilder();
		for(int i=chArr.length-1; i>=0; i-- ){
			olleh.append(chArr[i]);
		}
		System.out.println(olleh);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Olleh o= new Olleh();
		o.flip();
	}

}
