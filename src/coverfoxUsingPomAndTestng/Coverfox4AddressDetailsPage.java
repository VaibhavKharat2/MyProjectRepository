package coverfoxUsingPomAndTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfox4AddressDetailsPage {

	@FindBy(className = "mp-input-text")
	private WebElement pinCode;

	@FindBy(id = "want-expert")
	private WebElement mobileNumber;

	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement clickOnContinueButton;

	public Coverfox4AddressDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void EnterAddressDetails(String pinCodeNum, String mobNum) {
		pinCode.sendKeys(pinCodeNum);
		mobileNumber.sendKeys(mobNum);
	}

	public void clickOnContinueButton() {
		clickOnContinueButton.click();
	}

}
