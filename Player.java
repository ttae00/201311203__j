public class Player {
	
	private String name= null;
	int num=0;
	
	public Player(String _name){
		this.name=_name;
	}
	public String play(){
		Dice d= new Dice();
		
		d.roll();
		int num1=d.getNum();
		d.roll();
		int num2=d.getNum();
		int num3=num1+num2;
		
		num=num3;
		
		String str=" turns on 1 = " +num1
				+"\n turns on 2 = " +num2
				+"\n turns total = "+num +"\n";
		return str;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNum(){
		return this.num;
	}
}
