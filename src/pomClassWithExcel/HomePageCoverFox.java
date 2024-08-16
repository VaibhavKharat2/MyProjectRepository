package pomClassWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageCoverFox {

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement maleButton;
	
	public HomePageCoverFox(WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectGender() {
		
		maleButton.click();
		
	}
}
