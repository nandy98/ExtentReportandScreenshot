package seleniumPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndArrangeInAscendingOrder {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		
		Select select= new Select(element);
		
		List<WebElement> options = select.getOptions();
		ArrayList arr=new ArrayList();
		for(int i=0;i<options.size();i++) {
			//System.out.println(options.get(i).getText());
			arr.add(options.get(i).getText());
			options.get(i).click();
		}
		
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
		
	}

}
