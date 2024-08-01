package screenshotsT;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import screenshots.DwsRegisterBase;
@Listeners(screenshots.DwsRegisterListeners.class)
public class DwsRegisterTestcase extends DwsRegisterBase
{
   @Test 
   public void testcase()
   {
	   String given_url = "https://demowebshop.tricentis.com/registe";
	   String current_url=driver.getCurrentUrl();
		  assertEquals(given_url,current_url);
		  Reporter.log("Verification successfull",true);
		  
   }
}
