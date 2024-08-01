package screenshots;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import base.ExcelUtilityGiftcard;
import base.JavaUtility;
import pom.DwsGiftCards;

public class DwsGift25Base 
{
	 public static WebDriver driver;
	  
	  @BeforeClass
	  public void preCondition() throws IOException
	  {
		  String browser = JavaUtility.logindata("browser");
		  String url = JavaUtility.logindata("url");
		  if(browser.equals("chrome")) {
			   driver = new ChromeDriver();
		   }
		   
		   else if(browser.equals("edge")) {
			   driver =new EdgeDriver();
		   }
		   else if (browser.equals("firefox")) {
			   driver = new FirefoxDriver();
		   }
		   else {
			   driver = new ChromeDriver();
		   }
		   
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
	}
	  @BeforeMethod
	  public void addToCart() throws EncryptedDocumentException, IOException
	  {
		  DwsGiftCards ref = new DwsGiftCards(driver);
		  ref.giftcards();
		  ref.gift2();
		  
		  ArrayList<String>data= ExcelUtilityGiftcard.readExcel();
		  ref.textfield(data.get(0),data.get(1),data.get(2),data.get(3));
		  ref.msg2(data.get(4));
		//  ref.quantity2clear();
		 // ref.quatity2(data.get(5));
		  ref.addtocart2();
	  }
}
