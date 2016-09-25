package dd;

public class BrazilCoffee {
	
	
	String origin;
	int degreeOfRoast;
	int grade;
	
	public BrazilCoffee(String o) {
		// TODO Auto-generated constructor stub
		origin=o;
	}
	
	public void roast(){
		System.out.println("roasting..." + origin);
	}
	public void grind(){
		System.out.println("grinding..." + origin);
	}
	public void brew(){
		System.out.println("brewing..." + origin);
	}
	
	public static void main(String[] args){
		BrazilCoffee brazil= new BrazilCoffee("Brazil");
		brazil.roast();
	}
	
}
