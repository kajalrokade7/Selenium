package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReporterClass 
{
@Test
	   public void test()
	   {
		   String expected_url = "https://demowebshop.tricentis.com";
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://demowebshop.tricentis.com/");
		   String actual_url = driver.getCurrentUrl();
		   SoftAssert soft = new SoftAssert();
		   soft.assertNotEquals(expected_url, actual_url,"expected url is not matching");
		   Reporter.log("I am in dws homepage",true);
		   WebElement search_field = driver.findElement(By.id("small-searchterms"));
		   search_field.sendKeys("mobile",Keys.ENTER);
		   
		   WebElement advanced_search = driver.findElement(By.id("As"));
		   advanced_search.click();
		   soft.assertTrue(advanced_search.isSelected());
		   soft.assertAll();
		   driver.findElement(By.id("Isc")).click();
	   }
}
