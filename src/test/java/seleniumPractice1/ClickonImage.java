package seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		String baseURL ="https://www.freecharge.in/prepaid";
		
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		WebElement img = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/a/img"));
		img.click();
		
	}

}
