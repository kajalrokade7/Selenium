package vtiger;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import base.JavaUtility;

public class VTigerBase 
{
	 public static WebDriver driver;
	  
	  @BeforeClass
	  public void preCondition() throws IOException
	  {
		  String browser = JavaUtility.logindata("browser2");
		  String url = JavaUtility.logindata("vtigerurl");
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
			   driver = new EdgeDriver();
		   }
		   
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
	}
	  @BeforeMethod
	  public void login() throws IOException
	  {
		  VTigerPom vt = new VTigerPom(driver);
		  vt.userName(JavaUtility.logindata("vtusername"));
		  vt.password(JavaUtility.logindata("vtpassword"));
		  vt.loginButton();
	  }
}
