package com.sd.Draw;

public class DrawStringTriangle {
	
	public void draw(){
		
		String s="*";
		String white=" ";
		StringBuffer sbuf=new StringBuffer();
		
		for(int i=0; i<4; i++){
			sbuf.append(white);
		}
		
		sbuf.append(s);
		System.out.println(sbuf.toString());
		
		for(int j=0; j<4; j++){
			sbuf.append(s);
			sbuf.append(s);
			sbuf.deleteCharAt(0);
			System.out.println(sbuf.toString());
		}
	
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawStringTriangle dst= new DrawStringTriangle();
		dst.draw();
	}

}
