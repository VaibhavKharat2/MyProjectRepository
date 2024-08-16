package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLag3ValidateCartProduct {

	String addToCartProduct;
	@FindBy(className = "inventory_item_name")
	private WebElement yourProduct;

	@FindBy(xpath = "//a[text()='CHECKOUT']")
	private WebElement checkoutButton;

	public SwagLag3ValidateCartProduct(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void validateTestCase() {

		addToCartProduct = yourProduct.getText();
		System.out.println(addToCartProduct);
	}

	public void clickOnCheckOutButton() {

		checkoutButton.click();

	}

}
