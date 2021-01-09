package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/radio.html");
	List<WebElement> radiolist = driver.findElements(By.xpath("//*[@type='radio']"));
	
	//System.out.println(radiolist.get(1).getText());
	int size=radiolist.size();
	System.out.println("No of Radio Button is "+size);
	
	for(int i=0;i<size;i++) {
		String text = radiolist.get(i).getAttribute("value");
		
		System.out.println("Radio button"+i+":"+text);
		radiolist.get(i).click();
		
	}
	driver.close();
	
	
	
	}
}
