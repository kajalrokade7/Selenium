package pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners1.Basic.class)
public class Gift25 
{
	public static ArrayList<String> readExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Documents\\Giftcard.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		ArrayList<String> arr = new ArrayList<String>();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0; i<column; i++)
		{
			arr.add(sheet.getRow(0).getCell(i).toString());
		}
		return arr;
		
	}
@Test
public void testcase() throws InterruptedException, EncryptedDocumentException, IOException
{
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  String given_url = "https://demowebshop.tricentis.com/";
	  String current_url=driver.getCurrentUrl();
	  assertEquals(given_url,current_url);
	  Reporter.log("Verification successfull",true);
	  Thread.sleep(2000);
	  DwsGiftCards ref = new DwsGiftCards(driver);
	  ref.giftcards();
	  ref.gift2();
	 
	  ArrayList<String>data= readExcel();
	  ref.textfield(data.get(0),data.get(1),data.get(2),data.get(3));
	  ref.msg2(data.get(4));
	//  ref.quantity2clear();
	 // ref.quatity2(data.get(5));
	  ref.addtocart2();
      ref.shoppingcart();
	  WebElement gift25 = driver.findElement(By.xpath("(//a[contains(text(),'$25 Virtual Gift Card')])[2]"));
	  assertTrue(gift25.isDisplayed());
	  Reporter.log("Product is added to shopping cart",true);
	  driver.close();
	}
}
