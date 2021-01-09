package seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//driver.findElement(By.id("closeBtn")).click();
		WebElement dd = driver.findElement(By.name("country"));
		
		Select select= new Select(dd);
		
		List<WebElement> alldd = select.getOptions();
		System.out.println(alldd.size());
		ArrayList<String> arr= new ArrayList<String>();
		for(int i=0;i<alldd.size();i++) {
			String text = alldd.get(i).getText();	
			arr.add(text);
		
		}
		
		Collections.sort(arr);
		System.out.println(arr);
		driver.quit();
	}

}
