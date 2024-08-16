package coverfoxUsingPomAndTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox1HomePage {

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement genderMaleButton;

	public CoverFox1HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnGenderButton() {

		genderMaleButton.click();
	}
}
