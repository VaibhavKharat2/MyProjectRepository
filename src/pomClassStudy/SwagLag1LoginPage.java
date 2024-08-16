package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLag1LoginPage {
	
	@FindBy(id = "user-name")
	private WebElement userID;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passWord;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	public SwagLag1LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserID_Pass(String id, String pass) {
		
		userID.sendKeys(id);
		passWord.sendKeys(pass);	
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
//id:standard_user   pass:secret_sauce
