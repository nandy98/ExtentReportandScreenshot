package seleniumPractice1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

	
	public static void main(String[] args) {
		//DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");            To get Current day month year
		//DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");   To get Current Date and Time
		
		DateFormat dateFormat=new SimpleDateFormat("dd");					// To get only today date
		Date date = new Date();
		
		String dd = dateFormat.format(date);
		
		System.out.println(dd);
		
		
	}
}
