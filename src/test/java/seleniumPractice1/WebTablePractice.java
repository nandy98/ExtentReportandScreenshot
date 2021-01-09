package seleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		
		System.out.println("Header found "+ tableHeader.size());
		String[] str=new String[4];
		int j=0;
		for(WebElement header:tableHeader) {
			System.out.println(header.getText());
			str[j]=header.toString();
			j++;
		}
	}

}
