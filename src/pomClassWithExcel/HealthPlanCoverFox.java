package pomClassWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlanCoverFox {

	@FindBy(className = "next-btn")
	private WebElement nxtButton;

	public HealthPlanCoverFox(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickOnNextButton() {

		nxtButton.click();
	}

}
