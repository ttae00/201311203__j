package com.sd.Draw;

public class RockSiPaper {
	
	String player1, player2;
	String rock,scissor,paper;
	
	/*public void player(String player1, String player2){
		this.player1=player1;
		this.player2=player2;
	}
	*/
	public void play(String player1,String player2){
		if(player1==player2){
			System.out.println("draw");
		}else if(player1=="scissor"){
			if(player2=="rock"){
				System.out.println(player2 + " wins");
			}else if(player2=="paper"){
				System.out.println(player1 + " wins");
			}
		}else if(player1=="rock"){
			if(player2=="scissor"){
				System.out.println(player1 + " wins");
			}else if(player2=="paper"){
				System.out.println(player2 + " wins");
			}
		}else if(player1=="paper"){
			if(player2=="scissor"){
				System.out.println(player2 + " wins");
			}else if(player2=="rock"){
				System.out.println(player1 + " wins");
			}
		}else
			System.out.println("error");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockSiPaper rsp= new RockSiPaper();
		String player1="rock";
		String player2="rock";
		rsp.play(player1, player2);
	}

}
