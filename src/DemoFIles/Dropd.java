package DemoFIles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/SELENIUM/DD.html");
		WebElement ele=driver.findElement(By.xpath("//select"));
		Select b=new Select(ele);
		b.selectByIndex(0);
		Thread.sleep(2000);
		b.selectByValue("j");
		Thread.sleep(2000);
		
		
}
}
