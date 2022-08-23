package DemoFIles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF2 trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='KGF Chapter 2 Trailer|Hindi|Yash|Sanjay Dutt|Raveena Tandon|Srinidhi|Prashanth Neel|Vijay Kiragandur']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
	}

}


