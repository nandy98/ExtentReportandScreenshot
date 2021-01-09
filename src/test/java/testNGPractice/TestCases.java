package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

@Listeners(TestListenerDemo.class)
public class TestCases extends BaseClass {
	@Test
	public void doLogin() {
		String actual = driver.getTitle();
		System.out.println(actual);/*
		Assert.assertEquals(actual, "Google");
		test.log(LogStatus.PASS, "Navigated and Test Passed");
		//test.log(LogStatus.FAIL, "Navigated and Test Failed");
*/	
		if(actual.equals("Google"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
		}	
	
	
	
	/*@Test
	public void doLogin1() {
		Assert.fail();
		test.log(LogStatus.PASS, "Navigated and Test Passed");
		test.log(LogStatus.FAIL, "Navigated and Test Failed");
	}
	
	@Test
	public void doLogin2() {
		Assert.fail();
		test.log(LogStatus.PASS, "Navigated and Test Passed");
		test.log(LogStatus.FAIL, "Navigated and Test Failed");
	}*/
}
