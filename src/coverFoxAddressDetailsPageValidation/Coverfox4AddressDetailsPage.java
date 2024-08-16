package coverFoxAddressDetailsPageValidation;

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

	@FindBy(xpath = "//div[@class='error-ui']")
	private WebElement pinCodeErrorMassage;

	@FindBy(xpath = "(//div[contains(@class,'error-ui')])[2]")
	private WebElement MobNumErrorMassage;

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
	
	public String getErrorMassageOfPinCode() {
		String errorMassage = pinCodeErrorMassage.getText();
		return errorMassage;
	}
	
	public String getErrorMassageOfMobNumber() {
		String ErrorMassage = MobNumErrorMassage.getText();
		return ErrorMassage;
	}

}
