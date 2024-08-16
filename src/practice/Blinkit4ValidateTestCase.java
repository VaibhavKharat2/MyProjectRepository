package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blinkit4ValidateTestCase {

	public static String yourProductInCart;

	@FindBy(className = "CartButton__Container-sc-1tg3h4c-6 cnIrQF")
	private WebElement yourCartButton;

	@FindBy(xpath = "(//div[contains(@class,'DefaultProductCard')])[5]")
	private WebElement yourSelectedProduct;

	public Blinkit4ValidateTestCase(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickOnYourCartLogo() {

		yourCartButton.click();
	}

	public void validateTestCase() {

		yourProductInCart = yourSelectedProduct.getText();

		if (Blinkit2SelectProduct.product.equals(yourSelectedProduct)) {
			System.out.println("Test Case Is Passed");
		} else {
			System.out.println("Test Case Is Failed");
		}
	}

}
