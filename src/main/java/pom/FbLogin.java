package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin
{
 private @FindBy(xpath="//a[text()='Facebook']")
  WebElement fb;
 
 private @FindBy(xpath="//a[text()='Twitter']")
 WebElement tw;
 
 private@FindBy(xpath="(//input[@name=\"email\"])[2]")
 WebElement fbusername;
 
private @FindBy(xpath="(//input[@name='pass'])[2]")
 WebElement fbpassword;

private@FindBy(xpath="(//span[contains(text(),'Log in')])[3]")
WebElement fblogin;

private@FindBy(xpath="//span[contains(text(),'Sign up')]")
WebElement twsignup;

private@FindBy(xpath="//iframe[@allow=\"identity-credentials-get\"]")
WebElement signupwithgoogle;
 
 
 public FbLogin(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void facebook()
 {
	 fb.click();
 }
 public void twitter()
 {
	 tw.click();
 }
 public void fbUsername(String username)
 {
	fbusername.sendKeys(username); 
 }
 public void fbPassword(String password)
 {
	 fbpassword.sendKeys(password);
 }
 public void fbLogin()
 {
	 fblogin.click();
 }
 public void twSignup()
 {
	 twsignup.click();
 }
 public void signUpWithGoogle()
 {
	 signupwithgoogle.click();
 }
  
}
