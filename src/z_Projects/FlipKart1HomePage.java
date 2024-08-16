
 package z_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart1HomePage {

	@FindBy(name = "q")
	private WebElement searchField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButton;

	public FlipKart1HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterProductName(String product) { // poco x6 pro
		searchField.sendKeys(product);
	}

	public void searchProduct() {
		searchButton.click();
	}

}
