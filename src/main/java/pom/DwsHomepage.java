package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomepage 
{
	
    private @FindBy(xpath="//div[@class='header-links']/ul/li/a") 
	List<WebElement> header_links;
    
    private @FindBy(id="small-searchterms")
    WebElement search_textfield;
    
   private@FindBy(className="button-1 search-box-button")
   WebElement search;
    
   private @FindBy(xpath="//div[@class=\"header-menu\"]/ul/li/a")
   List<WebElement> header_menu;
    
    public DwsHomepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void header_links() throws InterruptedException
    {
    	List<WebElement> links = header_links;
    	links.get(0).click();
    	Thread.sleep(2000);
    	links.get(1).click();
    	Thread.sleep(2000);
    	links.get(2).click();
    	links.get(3).click();
    }
    public void search_textfields(String srch)
    {
    	search_textfield.sendKeys(srch);
    }
    public void search()
    {
    	search.click();
    }
    public void header_menu()
    {
    	List<WebElement> menu = header_menu;
    	menu.get(0).click();
    	menu.get(1).click();
    	menu.get(2).click();
    	menu.get(3).click();
    	menu.get(4).click();
    	menu.get(5).click();
    	menu.get(6).click();
    }
    
 }
