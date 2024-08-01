package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DwsGiftCards 
{
private@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
WebElement giftcards;

private@FindBy(xpath="//a[contains(text(),'$5 Virtual Gift Card')]")
WebElement gift1;

private@FindBy(xpath="//div[@class=\"giftcard\"]/div/input")
List<WebElement> textfield;

private@FindBy(id="giftcard_1_Message")
WebElement msg;

private@FindBy(id="add-to-cart-button-1")
WebElement addtocart;

private@FindBy(xpath="//a[contains(text(),'$25 Virtual Gift Card')]")
WebElement gift2;

private@FindBy(xpath="//div[@class=\"giftcard\"]/div/input")
List<WebElement> textfield2;

private@FindBy(id="giftcard_2_Message")
WebElement msg2;

private@FindBy(id="add-to-cart-button-2")
WebElement addtocart2;

private@FindBy(className="product-title")
WebElement gift3;

private@FindBy(xpath="//div[@class=\"giftcard\"]/div/input")
List<WebElement> textfield3;

private@FindBy(id="giftcard_1_Message")
WebElement msg3;

private@FindBy(id="add-to-cart-button-1")
WebElement addtocart3;

private@FindBy(xpath="//a[contains(text(),'$100 Physical Gift Card')]")
WebElement gift4;

private@FindBy(xpath="//div[@class=\"giftcard\"]/div/input")
List<WebElement> text4;

private@FindBy(id="giftcard_4_Message")
WebElement msg4;

private@FindBy(id="add-to-cart-button-4")
WebElement addtocart4;

private@FindBy(id="products-orderby")
WebElement sortby;

private@FindBy(id="products-pagesize")
WebElement display;

private@FindBy(id="products-viewmode")
WebElement view;

private@FindBy(id="addtocart_2_EnteredQuantity")
WebElement quantity2;

private@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
WebElement shoppingcart;

private@FindBy(xpath="(//a[contains(text(),'$25 Virtual Gift Card')])[2]")
WebElement verifyElement;

public DwsGiftCards(WebDriver driver)
{
  PageFactory.initElements(driver, this);	
}
public void giftcards()
{
	giftcards.click();
}
public void gift1()
{
	gift1.click();
}

public void textfield(String rname, String remail, String yname, String yemail)
{
	List<WebElement> text = textfield;
	text.get(0).sendKeys(rname);
	text.get(1).sendKeys(remail);
	text.get(2).sendKeys(yname);
	text.get(3).sendKeys(yemail);
}
public void msg(String msgs)
{
	msg.sendKeys(msgs);
}
public void addtocart()
{
	addtocart.click();
}
public void gift2()
{
	gift2.click();
}
public void textfield2(String rname, String remail, String yname, String yemail)
{
	List<WebElement> text = textfield2;
	text.get(0).sendKeys(rname);
	text.get(1).sendKeys(remail);
	text.get(2).sendKeys(yname);
	text.get(3).sendKeys(yemail);
}
public void msg2(String message)
{
	msg2.sendKeys(message);
}
public void quantity2clear()
{
	quantity2.clear();
}
public void quatity2(String qty)
{
	quantity2.sendKeys(qty);
}

public void addtocart2()
{
	addtocart2.click();
}
public void gift3()
{
	gift3.click();
}
public void textfield3(String rname,String remail, String yname, String yemail)
{
List<WebElement> text3 = textfield3;
text3.get(0).sendKeys(rname);
text3.get(1).sendKeys(remail);
text3.get(2).sendKeys(yname);
text3.get(3).sendKeys(yemail);
}
public void msg3(String message)
{
	msg3.sendKeys(message);
}
public void addtocart3()
{
	addtocart3.click();
}
public void gift4()
{
	gift4.click();
}
public void text4(String rname, String yname)
{
	List<WebElement> txt = text4;
	txt.get(0).sendKeys(rname);
	txt.get(1).sendKeys(yname);
}
public void msg4(String message)
{
	msg4.sendKeys(message);
}
public void addtocart4()
{
	addtocart4.click();
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

}
