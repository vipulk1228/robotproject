package robotprojectPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SampleClass {

	public static void main(String[] args) {

		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		driver.close();
	}

}
