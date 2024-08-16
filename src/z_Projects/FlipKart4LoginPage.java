package z_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart4LoginPage {

	@FindBy(xpath = "//input[contains(@class,'r4vIwl')]")
	private WebElement mobileNumberField;

	@FindBy(xpath = "//button[contains(@class,'QqFHMw')]")
	private WebElement countinueButton;

	public FlipKart4LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterMobileNumber(String number) {
		mobileNumberField.sendKeys(number);
	}

	public void clickOnContinueButton() {
		countinueButton.click();
	}

}
