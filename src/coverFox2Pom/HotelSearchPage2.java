package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSearchPage2 {

	Select s;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(className = "reg_button")
	private WebElement searchButton;

	public HotelSearchPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectLocation(String value) {
		s = new Select(location);
		s.selectByValue(value);
	}

	public void selectHotel(String value) {
		s = new Select(hotels);
		s.selectByValue(value);
	}

	public void roomType(String value) {
		s = new Select(roomType);
		s.selectByValue(value);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}
}
