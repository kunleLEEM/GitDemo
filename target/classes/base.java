package resources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	{
  prop= new Properties();
 FileInputStream pis=new FileInputStream("C:\\Users\\Kunle\\mavenjavarapp\\src\\main\\java\\resources\\data.properties");
 prop.load(pis);
 String browserName=prop.getProperty("browser");
 
 if(browserName.equals("chrome"))
 {
 	 System.setProperty("webdriver.chrome.driver", "C://Users//Kunle//chromedriver.exe");
 	driver= new ChromeDriver();
 		//execute in chrome driver
 	
 }
 else if (browserName.equals("firefox"))
 {
 	 driver= new FirefoxDriver();
 	//firefox code
 }
 else if (browserName.equals("IE"))
 {
// 	IE code
 }

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 return driver;
 
	}
 
	 
	 public void getScreenshot(String result) throws IOException
	 {
	 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	 FileUtils.copyFile(src, new File("C://rappScreenshot//"+result+"screenshot.png"));
	 
	 
	 }	

 
 
}

