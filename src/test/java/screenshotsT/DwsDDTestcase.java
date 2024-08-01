package screenshotsT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.DwsDigitalDownload;
import screenshots.DwsDDBase;
@Listeners(screenshots.DwsDDListeners.class)
public class DwsDDTestcase extends DwsDDBase
{
@Test
public void testcase()
{
	DwsDigitalDownload ref = new DwsDigitalDownload(driver);
	ref.shoppingcart();
	  
	  List<WebElement> price = driver.findElements(By.xpath("/span[@class='product-unit-price']"));
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
}
}
