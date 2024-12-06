package robotprojectPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Set<String>	id=driver.getWindowHandles();
		//System.out.println(id);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Set<String>	id=driver.getWindowHandles();
		
		for (String s:id) 
		{
			System.out.println(driver.switchTo().window(s).getTitle());
		}
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
