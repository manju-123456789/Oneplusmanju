package DemoFIles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parentid {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(4000);
	Set<String> all_wh = driver.getWindowHandles();
	int count=all_wh.size();
	System.out.println(count);
	for(String wh:all_wh)
	{
		System.out.println(wh);
	}
	
	
}
}
