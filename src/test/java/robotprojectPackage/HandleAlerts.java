package robotprojectPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to display an')])[1]")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alt.getText());
		alt.accept();
		
		driver.close();
	}

}
