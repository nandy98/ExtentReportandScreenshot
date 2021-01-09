package seleniumPractice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement elmt = driver.findElement(By.name("country"));
		
		Select select = new Select(elmt);
		
		List<WebElement> opt = select.getOptions();
		
		for(int i=0;i<=10;i++) {
			System.out.println(opt.get(i).getText());
			select.selectByIndex(i);
			
		}
	}

}
