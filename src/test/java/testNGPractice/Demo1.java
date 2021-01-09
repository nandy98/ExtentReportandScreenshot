package testNGPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void Launch1() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("");
	}
		
		
		
		
		/*String str= "my name is nandlal";
		String rev="";
		ArrayList<String> str= new ArrayList<String>();
		
		str.add("Nandlal");
		
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
	}*/
		
	
}
