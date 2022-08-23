package DemoFIles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rpee15t.testrail.io/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[(@class=\'login-input\']")).sendKeys("rkeerthikumar.qspiders@gmail.com");
		driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("Rpee@123");

}
}