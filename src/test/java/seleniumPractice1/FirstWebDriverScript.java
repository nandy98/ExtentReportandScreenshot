package seleniumPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverScript {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		String ExpectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		if(ExpectedTitle.contentEquals(actualTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		//System.exit(0);
		driver.quit();
		
		
	}

}
