package coverFox2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelItenaryPage {

	@FindBy(id = "order_id_text")
	private WebElement searchBookingId;
	
	@FindBy(id = "search_hotel_id")
	private WebElement goButton;
	
	@FindBy//(xpath = "//input[@id='btn_id_1260193']")
	(id = "order_id_1262400")
	private WebElement realId;
	
	 public HotelItenaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	 public void enterId(String id) {
		 
		 searchBookingId.sendKeys(id);
	 }
	 
	 public void clickOnGoButton() {
		 goButton.click();
	 }
	 
	 public String getReadId() {
		 System.out.println(realId.getText());
		 return realId.getText();
	 }
	
}
