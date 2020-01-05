package facebook;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Paytm {
  
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\learningSelenium\\src"
			+ "\\main\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");	
	String pw = driver.getWindowHandle();
	System.out.println("parent window : " +pw);
	Thread.sleep(10000);
	WebElement element = driver.findElement(By.xpath("//span[text() = 'Accept Payments']"));
	element.click();
	Set<String> windows = driver.getWindowHandles();
	
	for(String s : windows)
	{
		System.out.println(s);
		
		if(!(s.equalsIgnoreCase(pw)))
		{
			driver.switchTo().window(s);
			
		}
		
	}
	
	Thread.sleep(12000L);
	
	
	System.out.println(driver.getCurrentUrl());
	
	WebElement product = driver.findElement(By.xpath("//a[text() = 'Products']"));
	
	Actions action = new Actions(driver);
	action.moveToElement(product).perform();
	
	
	
	}	
	

}
