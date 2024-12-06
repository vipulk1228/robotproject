package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestClass {

	WebDriver driver;
	
	
	// constructor
	TestClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators
	
	@FindBy(id="email") WebElement email_loc;
	@FindBy(id="pass") WebElement pass_loc;
	@FindBy(name="login") WebElement clickBtn_loc;
	
	
	//Action Methods
	
	  public void setUsername(String user)
	   {
		email_loc.sendKeys(user);
		
	   }
	  public void setPass(String pass)
	  {
		pass_loc.sendKeys(pass);
		
	  }
	  
	  public void ClickBtn( )
	  {
		clickBtn_loc.click();
		
	  }

}
