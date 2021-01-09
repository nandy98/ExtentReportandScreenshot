package seleniumPractice1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatePicker {

	public static void main(String[] args) {
        int day, month, year;
          GregorianCalendar date = new GregorianCalendar();
          date.get(Calendar.DAY_OF_MONTH);
          System.out.println(date.get(Calendar.MONTH));
          
        /*  day = date.get(Calendar.DAY_OF_MONTH);
          month = date.get(Calendar.MONTH)+1;
          year = date.get(Calendar.YEAR);
          String today = "a_"+year+"_"+month+"_"+day;
          System.out.println(today);
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");     
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://www.yatra.com/");
    driver.findElement(By.id("BE_flight_depart_date")).click();
    driver.findElement(By.xpath("//a[@id='"+today+"']")).click();*/
   
    }
}
