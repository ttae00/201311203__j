package dicegame;

public class Dice {
	private int number= 0;
	
	public void roll(){
		number = (int) (Math.random() * 6);
		System.out.println("turns on " + number);
		
	}
	public int getNum(){
		return this.number;
	}

	
	
	
	}


