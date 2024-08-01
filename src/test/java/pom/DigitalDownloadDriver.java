package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DigitalDownloadDriver 
{
@Test
public void testcase() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  Thread.sleep(2000);
	  DwsDigitalDownload ref = new DwsDigitalDownload(driver);
	  ref.digitaldownload();
	  ref.addtocart();
	  ref.sortby();
	  ref.display();
	  ref.view();
}
}
