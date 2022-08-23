import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class alertAndcofirm {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("custid"));
	Thread.sleep(2000);
	
	

}
}
