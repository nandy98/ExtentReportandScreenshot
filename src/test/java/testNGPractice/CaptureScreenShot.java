package testNGPractice;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot extends BaseClass {
	
	public static String screenshotPath;

	public static void captureScreenshot(String methodName) {
		
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int date = cal.get(Calendar.DATE);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		screenshotPath=System.getProperty("user.dir")+"/Screenshot/"+methodName+"_"+year+"_"+(month+1)+ "_" + day + "_" + min + "_" + sec + ".jpeg";
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
