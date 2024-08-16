package z_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart2ProductList {

	public String selectedProduct;

	@FindBy(xpath = "(//div[@class='KzDlHZ'])[1]")
	private WebElement productName;

	public FlipKart2ProductList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getProductName() {
		selectedProduct = productName.getText();
	}

	public void clickOnSelectedProduct() {
		productName.click();
	}

}
