package dicegame;

public class Player {
	private String name= null;
	int num=0;
	int score=0;
	
	public Player(String _name){
		this.name=_name;
	}
	public void play(){
		Dice d= new Dice();
		d.roll();
		num= d.getNum();
	}
	
	public void setScore(int score){
		this.score=score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNum(){
		return this.num;
	}
}
