package pomClassStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLag5Result {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		SwagLag1LoginPage login = new SwagLag1LoginPage(driver);
		login.enterUserID_Pass("standard_user", "secret_sauce");
		login.clickOnLoginButton();

		SwagLag2ProductPage product = new SwagLag2ProductPage(driver);
		product.selectProductType();
		product.addToCartProduct();
		product.checkAddToCartProduct();

		String productselected = product.selectedProduct;

		SwagLag3ValidateCartProduct validate = new SwagLag3ValidateCartProduct(driver);
		validate.validateTestCase();
		String addedInCart = product.selectedProduct;
		validate.clickOnCheckOutButton();

		if (productselected.equalsIgnoreCase(addedInCart)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}

		SwagLab4InfornationPage info = new SwagLab4InfornationPage(driver);
		info.enterInformation();
		info.clickOnContinueButton();

	}

}
