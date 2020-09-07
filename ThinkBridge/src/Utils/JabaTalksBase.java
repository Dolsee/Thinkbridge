package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JabaTalksBase {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/DOLC/workspace/ThinkBridge/data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.print(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:/java+selenium/Chrome_Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
}
