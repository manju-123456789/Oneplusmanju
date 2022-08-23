import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disable {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\SELENIUM\\Disable.html");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("document.getElementById('t1').value='manager'");
				
	}

}
