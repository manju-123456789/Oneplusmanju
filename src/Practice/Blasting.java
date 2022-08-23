package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Blasting {
		public static void main(String[] args) throws InterruptedException {
			String[] name = {"Rajesh", "Manjunath", "Lakshmi", "Nithin", "Sunny", "Mia", "Danial"};
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("file:///C:/Users/DELL/Desktop/SELENIUM/send.html");
			
			for(int i=0; i<name.length; i++)
			{
				WebElement un = driver.findElement(By.xpath("//input[@placeholder='username']"));
				un.sendKeys(name[i]);
				Thread.sleep(1000);
				un.sendKeys(Keys.CONTROL + "ac");
				WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='password']"));
				pwd.sendKeys(Keys.CONTROL + "av");
				Thread.sleep(1000);
			}
	}
}
