package com.sd.Draw;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	
	Map<String,Integer> m= new HashMap<String,Integer>();
	char[] letters="sangmyung university".toCharArray();
	
	public void count(){
		
		String s;
		
		for(char c: letters){
			s=Character.toString(c);
			if(m.containsKey(s)){
				m.put(s,m.get(s)+1);
			}else{
				m.put(s, 1);
			}
		}
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountChar countC = new CountChar();
		countC.count();
	}

}
