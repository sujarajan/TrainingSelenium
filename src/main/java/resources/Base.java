package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
	Properties property=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Suja.Soundararajan\\eclipse-workspace\\TrainingSelenium\\src\\main\\java\\resources\\data.properties");
	
	property.load(file);
	
	String browserName= property.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suja.Soundararajan\\eclipse-workspace\\TrainingSelenium\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
	
	}
	
	

}
