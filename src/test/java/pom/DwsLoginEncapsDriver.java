package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DwsLoginEncapsDriver 
{
	
	@DataProvider(name="data")
	   public Object[][] sender() throws IOException
	   {
		Properties pop=new Properties();
		FileInputStream  fis=new FileInputStream(".\\configure\\loginfunctionsproperties");
		pop.load(fis);
		String user=pop.getProperty("username");
		String password=pop.getProperty("password");
		
		Object[][]obj= new Object[1][1];
		obj[0][0]=user;
		obj[1][0]=password;
		return obj;
	   }
  @Test(dataProvider="data")
  public void receiver(String data1, String data2) 
  {
	  
	
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  DwsLoginEncaps ref = new DwsLoginEncaps(driver);
	  ref.login_link();
	  ref.username(data1);
	  ref.password(data2);
	  ref.rememberme();
	  ref.login_button();
	  
	  
  }
}
