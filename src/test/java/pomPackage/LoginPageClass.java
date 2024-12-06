package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageClass {

	WebDriver driver;
	
	@BeforeTest
	 void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	}
	
	@Test
	 void testLogin()
	{
		//LoginTestClass lt=new LoginTestClass(driver);
		TestClass lt=new TestClass(driver);
		lt.setUsername("vipul");
		lt.setPass("vip");
		lt.ClickBtn();
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	
	@AfterTest
	 public void tearDown()
	{
		driver.close();
	}
	
}
