package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DwsDigitalDownload 
{
private@FindBy(xpath="//a[contains(text(),'Digital downloads')]")
WebElement digitaldownload;

private@FindBy(xpath="//div[@class=\"details\"]/div[3]/div[2]/input")
List<WebElement> addtocart;

private@FindBy(id="products-orderby")
WebElement sortby;

private@FindBy(id="products-pagesize")
WebElement display;

private@FindBy(id="products-viewmode")
WebElement view;

private@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
WebElement shoppingcart;

private@FindBy(xpath="//input[@name=\"updatecart\"]")
WebElement updatecart;


public DwsDigitalDownload(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void digitaldownload()
{
	digitaldownload.click();
}

public void addtocart() throws InterruptedException
{
	List<WebElement> cart = addtocart;
	cart.get(0).click();
	Thread.sleep(2000);
	cart.get(1).click();
	Thread.sleep(2000);
	cart.get(2).click();
}

public void sortby() throws InterruptedException
{
	WebElement sb = sortby;
	Select se =new Select(sb);
	List<WebElement> sort = se.getOptions();
	for (int i=0; i<sort.size(); i++) 
	{
		se.selectByIndex(i);
		sb = sortby;
		se=new Select(sb);
		Thread.sleep(2000);
	}
}

public void display() throws InterruptedException
{
	 WebElement displ = display;
	 Select dis =new Select(displ);
	 List<WebElement> d = dis.getOptions();
	 for (int i = 0; i < d.size(); i++) 
	 {
		 dis.selectByIndex(i);
		 displ = display;
		 dis=new Select(display);
		 Thread.sleep(1000);
	 }
}

public void view() throws InterruptedException
{
	    WebElement views = view;
		Select vi=new Select(views);
		List<WebElement> v = vi.getOptions();
		for (int i=0; i<v.size(); i++) 
		{
			vi.selectByIndex(i);
			views = view;
			vi=new Select(views);
			Thread.sleep(1000);
		}
}

public void shoppingcart()
{
	shoppingcart.click();
}
public void updateCart()
{
	updatecart.click();
}


}
