package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public WebDriver driver;

	By searchbox=By.xpath("//input[@title='Search']");
	
	public SearchPage(WebDriver driver) {	
		this.driver=driver;
	}
	
	public  WebElement getsearchbox( ) {
		
		return driver.findElement(searchbox);
		
	}
}
