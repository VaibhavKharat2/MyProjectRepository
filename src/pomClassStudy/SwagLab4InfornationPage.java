package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab4InfornationPage {

	@FindBy(id = "first-name")
	private WebElement firstname;

	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(id = "postal-code")
	private WebElement zipCode;

	@FindBy(xpath = "//input[@value='CONTINUE']")
	private WebElement continueButton;

	public SwagLab4InfornationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void enterInformation() {

		firstname.sendKeys("Vaibhav");
		lastName.sendKeys("Kharat");
		zipCode.sendKeys("445204");
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

}
