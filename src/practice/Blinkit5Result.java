package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Blinkit5Result {

	public static void main(String[] args) {


			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://blinkit.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			Blinkit1HomePage homePage = new Blinkit1HomePage(driver);
			homePage.enterInSearchField();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			Blinkit2SelectProduct selectProd = new Blinkit2SelectProduct(driver);
			selectProd.selectProduct();
			
			Blinkit3AddProductToCart addToCart = new Blinkit3AddProductToCart(driver);
			addToCart.clickOnAddToCartButton();
			
			Blinkit4ValidateTestCase validation = new Blinkit4ValidateTestCase(driver);
			validation.clickOnYourCartLogo();
			
			validation.validateTestCase();
			
	}

}
