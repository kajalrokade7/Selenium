package screenshots;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import base.JavaUtility;
import pom.DwsDigitalDownload;

public class DwsDDBase 
{
	 public static WebDriver driver;
	  
	  @BeforeClass
	  public void preCondition() throws IOException
	  {
		  String browser = JavaUtility.logindata("browser");
		  String url = JavaUtility.logindata("url");
		  if(browser.equals("chrome")) {
			   driver = new ChromeDriver();
		   }
		   
		   else if(browser.equals("edge")) {
			   driver =new EdgeDriver();
		   }
		   else if (browser.equals("firefox")) {
			   driver = new FirefoxDriver();
		   }
		   else {
			   driver = new ChromeDriver();
		   }
		   
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
	}
	  @BeforeMethod
	  public void addToCart() throws InterruptedException
	  {
		  DwsDigitalDownload ref = new DwsDigitalDownload(driver);
		  ref.digitaldownload();
		  ref.addtocart();
	  }
	  @AfterClass
	  public void postCondition()
	  {
	  	driver.quit();
	  	
	    }
}
