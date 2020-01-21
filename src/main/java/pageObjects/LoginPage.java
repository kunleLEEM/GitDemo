package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	
	
	By email=By.cssSelector("[id='emailAddress']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[id='signin-button-submit']"); 
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub //created from Homepage to give life to driver
		
		this.driver=driver;
		
	}

	public WebElement getEmail()
	{
		return  driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return  driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return  driver.findElement(login);
	}
}
