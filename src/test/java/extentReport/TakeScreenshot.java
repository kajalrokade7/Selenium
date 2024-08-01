package extentReport;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TakeSS;
@Listeners(com.crm.listeners1.TakeScreenshot.class)
public class TakeScreenshot extends TakeSS
{
 @Test
 public void loginFuntion()
 {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
 }
}
