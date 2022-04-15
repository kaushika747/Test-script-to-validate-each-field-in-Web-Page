package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class VerifyLogin {
	@Test 
	public void TestUser()
	{
		WebDriver driver =  BrowserFactory.BrowserOptions("Chrome", "https://login.salesforce.com/?locale=in" );
		LoginPage LoginSalesforce = PageFactory.initElements(driver, LoginPage.class);
		LoginSalesforce.LoginSalesforce("kaushika@gmail.com ", "abcdefgh");
	}

}
