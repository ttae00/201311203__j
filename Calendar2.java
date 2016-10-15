package p2;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Calendar2 {

	Calendar cal = Calendar.getInstance();
	
	public void setCal(int year, int month, int date, int hourOfDay, int minute, int second){
		
	}
	
	public void getCal(){
		
		int year= cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);      
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar2 c= new Calendar2();
		c.getCal();
		

	
	}

}
