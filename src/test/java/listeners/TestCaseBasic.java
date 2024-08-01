package listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.listeners1.DwsBaseListeners;
@Listeners(com.crm.listeners1.Basic.class)
public class TestCaseBasic extends DwsBaseListeners
{

@Test 
public void testCase1()
{
	String expected_url = "https://demowebshop.tricentis.com/";
	String actual_url = driver.getCurrentUrl();
	assertEquals(expected_url, actual_url);
	
}
@Test 
public void testCase2()
{
	String expected_url = "https://demowebshop.tricentis.com";
    String actual_url = driver.getCurrentUrl();
	assertEquals(expected_url, actual_url);
	
	
	
}
}
