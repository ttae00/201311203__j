package com.sd.Draw;

import ch.aplu.turtle.Turtle;

public class DrawSquareFrom {
	
	public void drawSquareFrom(double[][] tracks) {
        
        Turtle t1=new Turtle();
        for(double[] t:tracks) {
            t1.moveTo(t[0],t[1]);
        }
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		DrawSquareFrom dsf= new DrawSquareFrom();
		double[][] tracks={{100,100},{200,100},{200,200},{100,200},{100,100}};
		dsf.drawSquareFrom(tracks);
		}
	}


