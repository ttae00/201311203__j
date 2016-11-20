package com.sd.Draw;

import java.util.ArrayList;

public class AverageSeoul {
	int[][] data={
		    {74425, 76326},
		    {61164, 61636},
		    {109688, 115744},
		    {144796, 146776},
		    {174996, 181676},
		    {177841, 177434},
		    {204630, 205980},
		    {223373, 232245},
		    {161055, 166130},
		    {171576, 176735},
		    {279169, 293772},
		    {239450, 251066},
		    {148690, 156510},
		    {182977, 196992},
		    {237792, 242641},
		    {283869, 296762},
		    {209344, 210282},
		    {118965, 114441},
		    {186503, 186856},
		    {195734, 203014},
		    {254381, 249472},
		    {212401, 229111},
		    {271654, 295354},
		    {319197, 335045},
		    {229829, 231671}
		};
	
	public void sumMan(){
		
		ArrayList<Integer> sumM = new ArrayList<Integer>();
		ArrayList<Integer> sumW = new ArrayList<Integer>();
		
		
		for(int i=0; i<data.length; i++){
			//System.out.println(data[i][0]);
			sumM.add(data[i][0]);
			sumW.add(data[i][1]);
			for(int j=0; j<data[i].length; j++){
				//System.out.println("("+i+","+j+")="+data[i][j]);
			}
		}
		int totalSum = 0;
		int totalWomanSum=0;
		
		for(Integer s:sumM){
			totalSum = totalSum +s;
		}
		for(Integer w:sumW){
			totalWomanSum= totalWomanSum + w;
		}
		System.out.println("sum of Men: "+totalSum);
		System.out.println("average of Men: "+ totalSum/25);
		System.out.println("sum of Women: "+totalWomanSum);
		System.out.println("average of Women: "+totalWomanSum/25);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageSeoul as= new AverageSeoul();
		as.sumMan();
	}

}
