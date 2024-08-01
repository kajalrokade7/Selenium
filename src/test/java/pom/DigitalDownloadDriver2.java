package pom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DigitalDownloadDriver2 
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
		  ref.shoppingcart();
		  
		  List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		  List<Double> all = new ArrayList<Double>();
		  for(WebElement web : price)
		  {
			  Double prices = Double.parseDouble(web.getText());
			  all.add(prices);
		  }
		  int highestprice = all.indexOf(Collections.max(all));
		  System.out.println(highestprice);
		  System.out.println(all);
		  System.out.println(Collections.max(all));
		  driver.findElement(By.xpath("(//input[@name=\"removefromcart\"])["+(++highestprice)+"]")).click();
		  
		  ref.updateCart();
		  driver.close();
		  
	}
}
