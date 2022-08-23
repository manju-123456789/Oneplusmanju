package DemoFIles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ritclk 
{
	private Object keyEvent;

	public static void main(String [] args) throws InterruptedException, AWTException
		{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		       
		driver.get("https://www.google.com/");
		        Thread.sleep(2000);
		        WebElement rclick=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		        Actions act=new  Actions(driver);
		        Thread.sleep(2000);
		        act.contextClick(rclick).perform();
		        Thread.sleep(2000);
		        Robot r = new Robot();
				r.keyPress(KeyEvent.VK_T);
				 Thread.sleep(2000);
				r.keyRelease(KeyEvent.VK_T);		        
		        
	}
}
 