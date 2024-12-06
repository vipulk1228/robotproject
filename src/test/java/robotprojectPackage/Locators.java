package robotprojectPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone16"); // By ID
		mywait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
		//driver.findElement(By.id("nav-search-submit-button")).click();      
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();   //By Class_Name
		//driver.findElement(By.linkText("Sell")).click();				//By Link_Text
		
		driver.findElement(By.partialLinkText("Sel")).click();			//By Partial_Link_Text
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.name("email")).sendKeys("vipulk.0909@gmail.com");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\" and @type=\"submit\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\" and @type=\"submit\"]")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"continue\" and @type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
