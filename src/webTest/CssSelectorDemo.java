package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSelectorDemo {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://automationplayground.com/crm/login.htm");
	
	//tagname with id
	driver.findElement(By.cssSelector("input#email_id")).sendKeys("test@gmail.com");
	
	//tagname with attribute
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");

	//checkbox
	driver.findElement(By.cssSelector("input(id='remeber')")).click();
	
	//tagname with class name
	driver.findElement(By.cssSelector("button.btn-primary")).click();
	
	//tagname with class and attribute
	driver.findElement(By.cssSelector("button.btn-primary")).click();
	
	//tagname with class and attribute
	driver.findElement(By.cssSelector("a.btn-primary(id='new-customer')")).click();
	
}

}

