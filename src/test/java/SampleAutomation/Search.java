package SampleAutomation;

import java.io.IOException;

import org.openqa.selenium.Keys;


import org.testng.annotations.Test;

import pageObjects.SearchPage;
import pageObjects.SearchResultPage;
import resources.Base;

public class Search extends Base {
	
	
	@Test
	public void search() throws IOException, InterruptedException {
		driver =initializeDriver();
		driver.get("http://www.google.com//");
		SearchPage searchelement=new SearchPage(driver);
		searchelement.getsearchbox().sendKeys("facebook",Keys.ENTER);
		SearchResultPage res=new SearchResultPage(driver);
			res.getsearchresult().click();
		
		
		
		
	}
	
	
}
