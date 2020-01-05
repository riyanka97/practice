package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openApplication {
  
	public static void main(String[] args)
	{
		
		//https://www.axisbank.com/grab-deals/online-offers/offer-detail/axis-pay-axis-bank?cta=homepage-banner-first-axis-pay-iphone
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\learningSelenium\\src"
			+ "\\main\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.)
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	WebElement lastname2 = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Hello");
	
	WebElement login = driver.findElement(By.xpath("//input[@value = 'Log In']"));
	
	WebElement date =  driver.findElement(By.name("birthday_day"));
	date.click();
	
	Select select = new Select(date);
	//select.selectByVisibleText("5");
	
	}	
	

}
