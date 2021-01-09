package seleniumPractice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		String baseURL = "http://demo.guru99.com/test/radio.html";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<radios.size();i++) {
			String val = radios.get(i).getAttribute("value");
			radios.get(i).click();
			if(val.equals("Option 2")) {
				break;
			}
			System.out.println(radios.get(i).getAttribute("value"));
		}
	}

}
