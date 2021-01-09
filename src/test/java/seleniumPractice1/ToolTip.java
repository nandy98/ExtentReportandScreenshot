package seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/");
		WebElement tooltip = driver.findElement(By.id("toolTipButton"));
		
		Actions act= new Actions(driver);
		act.moveToElement(tooltip).build().perform();
		
		System.out.println(tooltip.getText());
	}

}
