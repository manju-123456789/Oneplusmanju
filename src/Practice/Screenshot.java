package Practice;

import java.io.File;

import org.apache.batik.util.ClassFileUtilities;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.pdfbox.pdmodel.interactive.form.FieldUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("E:\\Screenshot\\google.jpeg");
		
	    
		
	 
		
	
		
	}
}
