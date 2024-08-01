package screenshotsT;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.JavaUtility;
import pom.FbLogin;
import screenshots.DwsFbTwBase;
@Listeners(screenshots.DwsFbTwListeners.class)
public class DwsFbTwTestcase extends DwsFbTwBase
{
  @Test
  public void facebook() throws IOException, InterruptedException
  {
	  String user=JavaUtility.logindata("username");
		String password=JavaUtility.logindata("password");
		
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
  }
  @Test
  public void twitter() throws InterruptedException
  {
	  FbLogin ref = new FbLogin(driver);
	  ref.twitter();
	  String parent = driver.getWindowHandle();
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
