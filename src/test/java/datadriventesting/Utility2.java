package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility2 
{
	public static void main(String []args) throws IOException, InterruptedException
	{
	Properties pop=new Properties();
	FileInputStream  fis=new FileInputStream(".\\configure\\loginfunctionsproperties");
	
	pop.load(fis);
	
	String user=pop.getProperty("username");
	String password=pop.getProperty("password");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
