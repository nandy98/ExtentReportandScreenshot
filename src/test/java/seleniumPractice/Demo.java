package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		
		WebElement userID = driver.findElement(By.name("uid"));
		wait.until(ExpectedConditions.visibilityOf(userID));
		userID.sendKeys("mngr301970");
		WebElement password = driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("verugUs");
		WebElement login = driver.findElement(By.name("btnLogin"));
		login.click();
		driver.close();

	}

}
