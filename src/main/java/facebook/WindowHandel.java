package facebook;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandel {
  
	public static void main(String[] args) throws InterruptedException
	{
		
		//
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\learningSelenium\\src"
			+ "\\main\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.axisbank.com/grab-deals/online-offers/offer-detail/axis-pay-axis-bank?cta=homepage-banner-first-axis-pay-iphone");
	
	String pw = driver.getWindowHandle();
	System.out.println("parent window : " +pw);
	WebElement element = driver.findElement(By.xpath("//a[text() ='privacy policy.']"));
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
	
	Thread.sleep(8000L);
	
	WebElement cross = driver.findElement(By.linkText("//div[@id = 'nvpush_cross']"));
	
	cross.click();
	
	
	
	}	
	

}
