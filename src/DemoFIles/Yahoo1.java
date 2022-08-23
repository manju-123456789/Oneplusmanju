package DemoFIles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("dummy8999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Mj8999023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("dummy28999@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("dummy28999@yahoo.com");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Mj28999023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@tabindex='-1'][contains(.,'Send')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_yb_nuzwd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		driver.quit();
		WebDriver driver1 = new FirefoxDriver();
		 driver1.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("dummy28999");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("15936874123");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(2000);
}
}
