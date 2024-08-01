package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityGiftcard 
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
}
