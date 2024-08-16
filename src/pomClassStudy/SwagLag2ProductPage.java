package pomClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SwagLag2ProductPage {
	
	String selectedProduct;
	
	@FindBy(className = "product_sort_container")
	private WebElement productTypeDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Backpack')]")
	private WebElement productName;
	
	@FindBy(xpath = "(//button[contains(text(),'CART')])[2]")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//span[contains(@class,'fa-layers-counter')]")
	private WebElement yourCartButton;
	
	public SwagLag2ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectProductType() {
		Select s = new Select(productTypeDropDown);
		s.selectByValue("hilo");
	}
	
	public void addToCartProduct() {
		
	 selectedProduct=productName.getText();
	 System.out.println(selectedProduct);
		
		addToCartButton.click();
	}
	
	public void checkAddToCartProduct() {
		yourCartButton.click();
	}

}
