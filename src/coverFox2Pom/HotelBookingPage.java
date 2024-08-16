package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage {
	Select s;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditCardNumber;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement selectMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selectYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	public HotelBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterDetails(String name, String lname, String addr, String cartno, String cvno) {

		firstName.sendKeys(name);
		lastName.sendKeys(lname);
		address.sendKeys(addr);
		creditCardNumber.sendKeys(cartno);
		cvvNumber.sendKeys(cvno);
	}

	public void cardType(String value) {
		s = new Select(cardType);
		s.selectByValue(value);
	}

	public void month(String value) {
		s = new Select(selectMonth);
		s.selectByValue(value);
	}

	public void year(String value) {
		s = new Select(selectYear);
		s.selectByValue(value);
		
		//cvvNumber.sendKeys("232");
	}

	public void clickOnBookNow() {
		bookNow.click();
	}

}
