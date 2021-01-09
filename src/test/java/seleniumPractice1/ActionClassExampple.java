package seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExampple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		String baseURL ="https://www.myntra.com/";
		
		driver.get(baseURL);
		WebElement element = driver.findElement(By.xpath("//a[@data-group='offers']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}

}
