package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		 WebElement source = driver.findElement(By.id("credit2"));
		 WebElement target = driver.findElement(By.className("placeholder"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		WebElement source2 = driver.findElement(By.id("fourth"));
		 WebElement target2 = driver.findElement(By.id("amt7"));
		
		action.dragAndDrop(source2, target2).build().perform();
		WebElement source3 = driver.findElement(By.id("credit1"));
		 WebElement target3 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
	
		action.dragAndDrop(source3, target3).build().perform();
		WebElement source4 = driver.findElement(By.id("fourth"));
		 WebElement target4 = driver.findElement(By.id("amt8"));
		
		action.dragAndDrop(source4, target4).build().perform();
		
		
	}

}
