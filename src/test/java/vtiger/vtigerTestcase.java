package vtiger;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(vtiger.VTigerListeners.class)
public class vtigerTestcase extends VTigerBase
{
@Test
public void testcase()
{
	String given_url = "https://localhost:8888";
	String current_url = driver.getCurrentUrl();
	assertEquals(given_url,current_url);
}
}
