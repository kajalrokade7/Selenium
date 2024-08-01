package pom;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.JavaUtility;
@Listeners(com.crm.listeners1.Basic.class)
public class DwsLoginProp 
{
	@Test
	  public void testcase() throws IOException
	  {
		
		String user=JavaUtility.logindata("username");
		String password=JavaUtility.logindata("password");
		
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  String given_url ="https://demowebshop.tricentis.com/";
		  String current_url=driver.getCurrentUrl();
		  assertEquals(given_url, current_url);
		  Reporter.log("Verification is successful");
		  
		  DwsLoginEncaps ref = new DwsLoginEncaps(driver);
		  ref.login_link();
		  ref.username(user);
		  ref.password(password);
		  ref.rememberme();
		  ref.login_button();
		  
		  
	  }
	}

