package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailPage {

	@FindBy(className = "mp-input-text")
	private WebElement pincode;

	@FindBy(id = "want-expert")
	private WebElement mobNumber;

	@FindBy(className = "next-btn")
	private WebElement continueButton;

	public CoverFoxAddressDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void enterDetails() {

		pincode.sendKeys("445204");

		mobNumber.sendKeys("9067044164");
	}

	public void clickOnContinueButton() {

		continueButton.click();

	}
}
