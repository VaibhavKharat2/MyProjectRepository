package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blinkit2SelectProduct {

	public static String product;

	@FindBy(xpath = "(//div[contains(text(),'Cadbury Dairy')])[2]")
	private WebElement selectProduct;

	public Blinkit2SelectProduct(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void selectProduct() {
		product = selectProduct.getText();
		selectProduct.click();
	}

}
