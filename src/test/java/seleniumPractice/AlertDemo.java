package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("54210");
		driver.findElement(By.name("submit")).click();
		String atext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		System.out.println(atext);
		driver.close();
		
		
	}

}
