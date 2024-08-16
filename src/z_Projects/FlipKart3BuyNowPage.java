package z_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart3BuyNowPage {

	public String productConfirm;

	@FindBy(xpath = "//span[@class='VU-ZEz']")
	private WebElement selectedProdName;

	@FindBy(xpath = "(//ul[@class='row']//button)[2]")
	private WebElement buyNowButton;

	public FlipKart3BuyNowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getConfirmProductName() {
		productConfirm = selectedProdName.getText();
	}

	public void clickOnBuyNowButton() {
		buyNowButton.click();
	}

}

////span[@class='VU-ZEz']