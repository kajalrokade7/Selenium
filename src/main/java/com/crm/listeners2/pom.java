package com.crm.listeners2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom
{
	private @FindBy(className="ico-register")
	WebElement register;

	private@FindBy(id="gender-female")
	WebElement gender;

	private @FindBy(xpath="//div[@class=\"inputs\"]/input")
	List<WebElement> textfields;

	@FindBy(id="register-button")
	WebElement register_button;

	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void register()
	{
		register.click();
	}
	public void gender()
	{
		register.click();
	}
	public void textfields(String name, String surname, String email, String pass, String compass)
	{
		List<WebElement> reg = textfields;
		reg.get(0).sendKeys(name);
		reg.get(1).sendKeys(surname);
		reg.get(2).sendKeys(email);
		reg.get(3).sendKeys(pass);
		reg.get(4).sendKeys(compass);
	}
	public void register_button()
	{
		register_button.click();
	}
}
