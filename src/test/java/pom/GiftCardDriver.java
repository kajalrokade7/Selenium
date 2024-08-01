package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GiftCardDriver 
{
@Test
public void testcase() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  Thread.sleep(2000);
	  DwsGiftCards ref = new DwsGiftCards(driver);
	  ref.giftcards();
	  ref.gift1();
	  ref.textfield("kajal","kajal1@gmail.com", "vishal", "vishal1@gmail.com");
	  ref.msg("Hello");
	  ref.addtocart();
	  driver.navigate().back();
	  ref.gift2();
	  ref.textfield2("kajal","kajal1@gmail.com", "vishal", "vishal1@gmail.com");
	  ref.msg2("Hello");
	  ref.addtocart2();
	  driver.navigate().back();
	  ref.gift3();
	  ref.textfield3("kajal","kajal1@gmail.com", "vishal", "vishal1@gmail.com" );
	 ref.msg3("Hello");
	 ref.addtocart3();
	 driver.navigate().back();
	 ref.gift4();
	 ref.text4("kajal", "vishal");
	 ref.msg4("Hello");
	 ref.addtocart4();
	 driver.navigate().back();
	 ref.sortby();
	  ref.display();
	  ref.view();
}
}
