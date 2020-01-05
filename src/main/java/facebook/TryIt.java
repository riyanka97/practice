package facebook;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TryIt {
  
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\learningSelenium\\src"
			+ "\\main\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");	
	
	//<iframe frameborder="0" id="iframeResult" name="iframeResult"></iframe>
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	File local = new File("C:\\Users\\Hp\\Desktop\\Screenshot\\Alert.png");
	
	FileUtils.copyFile(file, local);
	
	Alert alert =	driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
	
	
	
	}	
	

}
