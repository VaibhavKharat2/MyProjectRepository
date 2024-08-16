package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPage {

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement loginButton;

	public HotelLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterCrediantials(String id, String pass) {
		userName.sendKeys(id);
		passWord.sendKeys(pass);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

}
