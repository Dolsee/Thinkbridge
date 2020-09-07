package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JabaTalksSignUpData {
	
	WebDriver driver;
	public JabaTalksSignUpData(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@ng-model='signUpData.Name']")
	WebElement username;
	
	@FindBy(xpath="//*[@ng-model='signUpData.Company']")
	WebElement organization;
	
	@FindBy(xpath="//*[@ng-model='signUpData.Email']")
	WebElement email;
	
	@FindBy(css="*[class='black-color ng-binding']")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement button;
	
	@FindBy(css="*[class='alert alert-danger alert-custom']")
	WebElement validation;
	
	public WebElement name()
	{
		return username;
	}
	
	public WebElement company()
	{
		return organization;
	}
	
	public WebElement email()
	{
		return email;
	}
	
	public WebElement checkbox()
	{
		return checkbox;
	}

	public WebElement submitButton()
	{
		return button;
	}
	
	public WebElement checkValidation()
	{
		return validation;
	}

}

