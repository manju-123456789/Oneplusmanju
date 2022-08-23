package DemoFIles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkcheck {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/SELENIUM/checkbox.html");
        List<WebElement> ele = driver.findElements(By.xpath("//input"));
        int count=ele.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
{
		WebElement we= ele.get(i);
		we.click();
         
        
        
}
        for(int i=count-1;i>=0;i--)
        {
        		WebElement we1= ele.get(i);
        		we1.click();
	}
	}
}

