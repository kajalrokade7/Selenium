package testngBike;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tvs 
{
	@Test
	  public void campusShoe() throws InterruptedException
	  {
		  WebDriver driver = new ChromeDriver();   
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.tvsmotor.com/");
			Thread.sleep(2000);
			driver.close();
	  }
}
