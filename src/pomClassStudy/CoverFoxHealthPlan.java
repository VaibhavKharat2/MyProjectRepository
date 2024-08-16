package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan {

	@FindBy(xpath = "//div[text()=' Next ']")
	private WebElement nextButton;
	
	public CoverFoxHealthPlan(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNextButton() {
		
		nextButton.click();
	}

}
