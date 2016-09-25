package dd;

public class Person {
	
	private float weight;
	public void setWeight(float w){
		this.weight=w;
	}
	private float getWeight(){
		return weight;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person me = new Person();
		me.setWeight((float)50.0);
		
		System.out.println(me.getWeight());
	}

}
