package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.JavaUtility;

public class FbLoginDriver 
{
@Test 
public void testcase() throws InterruptedException, IOException
{
	
	String user=JavaUtility.logindata("username");
	String password=JavaUtility.logindata("password");
	
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	 FbLogin ref = new FbLogin(driver);
	 ref.facebook();
	 Thread.sleep(2000);
	 String parent = driver.getWindowHandle();
	 Set<String> childhandles = driver.getWindowHandles();
	 childhandles.remove(parent);
		Thread.sleep(1000);
		for(String str : childhandles)
		{
			driver.switchTo().window(str);
		}
	ref.fbUsername(user);
	ref.fbPassword(password);
	ref.fbLogin();
	Thread.sleep(2000);
	driver.switchTo().window(parent);
	Thread.sleep(2000);
	
	 ref.twitter();
	 Set<String> twhandles = driver.getWindowHandles();
	 twhandles.remove(parent);
		Thread.sleep(1000);
		for(String str : twhandles)
		{
			driver.switchTo().window(str);
		}
	 Thread.sleep(6000);
	 ref.twSignup();
	 
	 driver.switchTo().frame(0);
	 Thread.sleep(2000);
	 ref.signUpWithGoogle();
	 
	
}
}
