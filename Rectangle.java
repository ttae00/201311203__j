package dd;

public class Rectangle {
	
	
	private int width;
	private int height;
	
	public Rectangle(int w, int h){
		this.width=w;
		this.height=h;
	}
	
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height=h;
	}
	public void setWidth(int newWidth){
		width= newWidth;
	}
	
	public void setSize(int w, int h){
		setWidth(w);
		setHeight(h);
	}
	
	public int calcArea(){
		return width * height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle(2, 3);
		
		System.out.println("면적: " + r.calcArea());
		
		r.setSize(3, 4);
		
		System.out.println("면적: " + r.calcArea());

	}

}
