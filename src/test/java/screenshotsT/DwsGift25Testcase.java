package screenshotsT;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.DwsGiftCards;
import screenshots.DwsGift25Base;
@Listeners(screenshots.DwsGift25Listeners.class)
public class DwsGift25Testcase extends DwsGift25Base
{
@Test
public void testcase()
{
	DwsGiftCards ref = new DwsGiftCards(driver);
	ref.shoppingcart();
	  WebElement gift25 = driver.findElement(By.xpath("(/a[contains(text(),'$25 Virtual Gift Card')])[2]"));
	  assertTrue(gift25.isDisplayed());
	  Reporter.log("Product is added to shopping cart",true);
}
}
