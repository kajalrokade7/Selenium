package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsLoginDriver 
{
  @Test
  public void testcase() throws InterruptedException
  {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://demowebshop.tricentis.com/");
  DwsLogin ref = new DwsLogin(driver);
  Thread.sleep(2000);
  ref.login_link.click();
  Thread.sleep(2000);
  ref.username.sendKeys("admin01@gmail.com");
  Thread.sleep(2000);
  ref.password.sendKeys("Admin01");
  Thread.sleep(2000);
  ref.login_button.click();
  }
  
}
