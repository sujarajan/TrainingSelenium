package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	public WebDriver driver;

	By searchres=By.xpath("//div[@class='yuRUbf']//a[contains(@href,'https://www.facebook.com')]//*[text()='Facebook - Log In or Sign Up']");
	
	public SearchResultPage(WebDriver driver) {	
		this.driver=driver;
	}
	
	public  WebElement getsearchresult( ) {
		
		return driver.findElement(searchres);
		
	}
	
}
