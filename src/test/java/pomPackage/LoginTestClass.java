package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTestClass {
	
	WebDriver driver;
	
	// constructor
	
	public LoginTestClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locators
	
	By usrname_loc=By.id("email");
	By pass_loc=By.id("pass");
	By click_Btn=By.name("login");
	
	
	
	// Actions Methods
  
  public void setUsername(String user)
   {
	driver.findElement(usrname_loc).sendKeys(user);
	
   }
  public void setPass(String pass)
  {
	
	driver.findElement(pass_loc).sendKeys(pass);
  }
  
  public void ClickBtn( )
  {
	
	driver.findElement(click_Btn).click();
  }


}
