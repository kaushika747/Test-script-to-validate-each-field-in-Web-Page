package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
	}

	@FindBy(how = How.ID, using="username")
	WebElement UserEmail;

	@FindBy(how = How.ID, using="password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"Login\"]") 
	WebElement LoginBtn;

	public void LoginSalesforce(String Uemail, String Psd)

	{
		UserEmail.sendKeys(Uemail);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}

}
