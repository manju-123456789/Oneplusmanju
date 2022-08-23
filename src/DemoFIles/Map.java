package DemoFIles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Map {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input'and@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore,karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg52']")).sendKeys("Davanagere,karnataka");
		driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip'and@class='mL3xi']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("driver.findElement(By.xpath(//img[(@jsan='\"7.OzmNAc,8.src,0.alt,22.jsaction,t-yjau3XByDUw,0.aria-label,0.data-tooltip\']")).click();
	
}
}

