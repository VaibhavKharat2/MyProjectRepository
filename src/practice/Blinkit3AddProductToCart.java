package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blinkit3AddProductToCart {

	@FindBy(id = "402414")
	private WebElement selectUnit;

	@FindBy(xpath = "//div[text()='Add to cart']")
	private WebElement addToCartButton;

	public Blinkit3AddProductToCart(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void selectUnits() {

		selectUnit.click();
	}

	public void clickOnAddToCartButton() {

		addToCartButton.click();
	}

}
