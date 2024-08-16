package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetail {

	@FindBy(id = "Age-You")
	private WebElement ageDropDown;

	@FindBy(className = "next-btn")
	private WebElement nextButton;

	public CoverFoxMemberDetail(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void selectAgeDropDown() {

		Select s = new Select(ageDropDown);
		s.selectByValue("24y");
	}

	public void clickOnNextButton() {

		nextButton.click();
	}

}
