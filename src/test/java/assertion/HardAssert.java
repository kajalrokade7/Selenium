package assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HardAssert 
{
@Test
   public void test()
   {
	   String expected_url = "https://demowebshop.tricentis.com/";
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://demowebshop.tricentis.com/");
	   String actual_url = driver.getCurrentUrl();
	   assertEquals(expected_url, actual_url);
	   WebElement search_field = driver.findElement(By.id("small-searchterms"));
	   search_field.sendKeys("mobile",Keys.ENTER);
   }
}
