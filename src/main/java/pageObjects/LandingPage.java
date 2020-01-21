package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	//By signing=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("[class='main-heading sign-in']");
	By NavBar=By.cssSelector("[class='additional-side-messaging messaging']");//add css here
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub //created from Homepage to give life to driver
		
		this.driver=driver;
		
	}

	/*public WebElement getLogin()
	{
		return  driver.findElement(signing);
	}
	*/
	public WebElement getTitle()
	{
		return  driver.findElement(title);
	}
	
	public WebElement getNavigationBar()
	{
		return  driver.findElement(NavBar);
	}
}
