package testngPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginClass {
	
	WebDriver driver;
	
	
  @Test(priority=1,groups= {"sanity"})
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  }
  
  @Test(priority=2,dataProvider="dp")
  void login(String user,String pass) throws InterruptedException
  {
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys(user);
	  driver.findElement(By.id("pass")).sendKeys(pass);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(10000);
	  boolean b=driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed();
	  Assert.assertEquals(b, true);
  }
  
  @Test(priority=3,groups= {"sanity"})
   void tearDown()
   {
	   driver.close();
   }
  
  
  @DataProvider(name="dp",indices = {0,4})
  Object loginData()
  {
	  
	  Object data [][]= {
			              {"vip@gmail.com","vipul"},
			              {"vip1@gmail.com","vipul1"},
			              {"vip2@gmail.com","vipul2"},
			              {"vip3@gmail.com","vipul3"},
			              {"vip3@gmail.com","vipul4"},
	  };
	  
	  return data;
  }
}
