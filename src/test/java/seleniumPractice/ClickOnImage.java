package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.delhivery.com/track/package/1337629955594");
		String text = driver.getTitle();
		System.out.println(text);
		driver.findElement(By.className("img-responsive")).click();
		
		String text1 = driver.getTitle();
		String title = "Courier Pickup, Delivery, Online Shipping Services, Logistics & Supply Chain – Delhivery";
		System.out.println(driver.getCurrentUrl());
		System.out.println(text1);
		if(driver.getTitle().equals(title)) {
			System.out.println("We are on HomePage");
		}else {
			System.out.println("We are not on HomePage");
		}
		

	}

}
