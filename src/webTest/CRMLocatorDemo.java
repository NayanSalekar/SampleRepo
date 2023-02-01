package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMLocatorDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");

		 //Link automation
		 driver.findElement(By.linkText("Sign In")).click();
		 
		 //Email Id
		 driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		 
		 //password
		 driver.findElement(By.id("password")).sendKeys("test123");
		 
		 //checkbox
		 driver.findElement(By.id("remember")).click();
		 
		 //button
		 driver.findElement(By.name("submit-name")).click();
	}
}
