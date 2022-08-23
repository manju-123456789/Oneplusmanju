package DemoFIles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/SELENIUM/checkbox.html");
		      List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		      for( WebElement value:checkbox)
		      {
		    	  value.click();
		    	  Thread.sleep(2000);
		    	  
		      }
		

}
}
