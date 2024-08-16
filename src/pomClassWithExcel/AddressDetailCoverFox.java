package pomClassWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetailCoverFox {

	@FindBy(className = "mp-input-text")
	private WebElement pinCode;

	@FindBy(className = "cb--input-box")
	private WebElement mobNo;

	@FindBy(className = "next-btn")
	private WebElement nextButton;

	public AddressDetailCoverFox(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void enterAddressDetais(String pinCodeNum, String MobileNum) {

		pinCode.sendKeys(pinCodeNum);

		mobNo.sendKeys(MobileNum);

	}

	public void clickOnNextButton() {

		nextButton.click();
	}

}
