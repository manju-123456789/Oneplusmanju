package DemoFIles;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keybord {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/SELENIUM/send.html");
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='username']"));
		Thread.sleep(2000);
		un.sendKeys(Keys.CONTROL + "ac");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='password']"));
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL + "av");
		Thread.sleep(2000);
}
}
