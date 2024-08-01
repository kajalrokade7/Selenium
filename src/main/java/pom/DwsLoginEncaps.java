package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginEncaps 
{
	   private @FindBy(className = "ico-login")
	   WebElement login_link;
	   
	   private @FindBy(id="Email")
	   WebElement username;
	   
	   private @FindBy(name="Password")
	   WebElement password;
	   
	   private @FindBy(xpath="//input[@value='Log in']")
	   WebElement login_button;
	   
	  private @FindBy(id="RememberMe")
	   WebElement rememberme;
	   
	   public DwsLoginEncaps(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void login_link()
	   {
		   login_link.click();
	   }
	   public void username(String user)
	   {
		   username.sendKeys(user);
	   }
	   public void password(String pass)
	   {
		   password.sendKeys(pass);
	   }
	   public void login_button()
	   {
		   login_button.click();
	   }
	   public void rememberme()
	   {
		   rememberme.click();
	   }
}
