package RappE2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.base;

public class ValidateNavigationBar extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
        driver=InitializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	
	public void validateAppNavBar() throws IOException
	
	{
		
				// CRREATING AN OBJECT TO A PAGE OBJECT CLASS AND INVOKE METHOD LIKE INHERITANCE
		LandingPage l=new LandingPage(driver);
		// check if elements are present on page
		Assert.assertTrue(l.getNavigationBar().isDisplayed());  
		
		//l.getNavigationBar().isDisplayed();
		
		
	}

	

@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}