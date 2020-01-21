package RappE2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
        driver=InitializeDriver();
		
        log.info("Driver Is Initialised");
        
		driver.get(prop.getProperty("url"));
		log.info("Home Page navigation");
		
	}
	
	@Test(dataProvider="getData")
	
	public void loginPage(String Email,String Password) throws IOException
	
	{
		driver.get(prop.getProperty("url"));
		
		// CRREATING AN OBJECT TO A PAGE OBJECT CLASS AND INVOKE METHOD LIKE INHERITANCE
		//LandingPage l=new LandingPage(driver);
		//l.getLogin().click();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Email);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
		log.info("Login Successful");
	}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
			driver=null;
	}

	@DataProvider //PARAMETERIZATION
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2]; // the first is the array size and second is value per test(column count)
		
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		//data[0][2]="";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		//data[1][2]="";
		
		return data;
		
		
	}
	
	
}
