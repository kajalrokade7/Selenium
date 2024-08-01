package pom;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DwsReg 
{
	public static ArrayList<String> readExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Documents\\DwsRegister.xlsx");
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
		  String given_url = "https://demowebshop.tricentis.com/register";
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(2000);
		  DwsRegister ref = new DwsRegister(driver);
		  ref.register();
		  
		  String current_url=driver.getCurrentUrl();
		  assertEquals(given_url,current_url);
		  Reporter.log("Verification successfull",true);
		  
		  ref.gender();
		  
		  ArrayList<String>data= readExcel();
		  ref.textfields(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4));
		  
		  ref.register_button();
	}
}
