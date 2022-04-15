

package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver BrowserOptions(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "D:\\DXC Selenium Automation Testing\\Validate Each field\\Chrome Driver\\chromedriver.exe");
 
			driver = new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\DXC Selenium Automation Testing\\Validate Each field\\Firefox Driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
