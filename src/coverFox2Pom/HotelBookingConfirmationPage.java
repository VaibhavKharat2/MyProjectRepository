package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingConfirmationPage {
	
	@FindBy(xpath = "//input[@name='order_no']" )              
	private WebElement bookingId;
	
	@FindBy(id = "my_itinerary")
	private WebElement mybookingDetails;
	
	public HotelBookingConfirmationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getConfirmBookingId() throws InterruptedException {
		System.out.println("-----------");

		Thread.sleep(1000);
		System.out.println(bookingId.getText()+" Booking id");
		return bookingId.getText();
		
	}
	
	public void itineraryButton() {
		mybookingDetails.click();
	}

}
