package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAutomation {

	public static void main(String[] args)
	
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	driver.findElement(By.name("username")).sendKeys("Admin");
	
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.className("oxd-button")).click();
	
	driver.findElement(By.className("oxd-userdropdown-icon")).click();
	
	driver.findElement(By.linkText("Logout")).click();
	
	}
}
