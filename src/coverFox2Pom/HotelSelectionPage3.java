package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelectionPage3 {
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectHotel;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public HotelSelectionPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHotels() {
		selectHotel.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}

}
