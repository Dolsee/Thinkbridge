package UserSignUp;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helpers.JabaTalksSignUpData;
import Utils.JabaTalksBase;

public class CreateAccount extends JabaTalksBase {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void SignUp() throws IOException, InterruptedException
	{
		JabaTalksSignUpData signUpData= new JabaTalksSignUpData(driver);
		signUpData.name().sendKeys("Dolsee");
		signUpData.company().sendKeys("Sharma");
		signUpData.email().sendKeys("do@gmail.com");
		signUpData.checkbox().click();
		signUpData.submitButton().click();
		String ExpectedValidation ="A welcome email has been sent. Please check your email.";
		Thread.sleep(1000);
		String ActualValidation = signUpData.checkValidation().getText();
		Assert.assertEquals(ActualValidation, ExpectedValidation);
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}

}
