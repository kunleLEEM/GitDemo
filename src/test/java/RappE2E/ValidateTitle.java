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

public class ValidateTitle extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
        driver=InitializeDriver();
		
        log.info("Driver Is Initialised");
		driver.get(prop.getProperty("url"));
		
		log.info("Home Page navigation");
		
	}
	
	@Test
	
	public void validateAppTitle() throws IOException
	
	{
		
		
		// CRREATING AN OBJECT TO A PAGE OBJECT CLASS AND INVOKE METHOD LIKE INHERITANCE
		LandingPage l=new LandingPage(driver);
		// compare text from expected to actual
		Assert.assertEquals(l.getTitle().getText(), "Sign in to your account"); 
		// l.getTitle().getText(); actual
		
		log.info("Text Validated succesfully");
		
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
