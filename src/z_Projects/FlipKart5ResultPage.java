package z_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FlipKart5ResultPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		FlipKart1HomePage flipKartHomePage = new FlipKart1HomePage(driver);
		flipKartHomePage.enterProductName("poco x6 pro");
		Thread.sleep(500);
		flipKartHomePage.searchProduct();

		FlipKart2ProductList productList = new FlipKart2ProductList(driver);
		productList.getProductName();
		productList.clickOnSelectedProduct();
		Thread.sleep(1000);

		SwitchToNextTab switchTab = new SwitchToNextTab();
		switchTab.switchTab(driver);
		Thread.sleep(1000);

		FlipKart3BuyNowPage buyNow = new FlipKart3BuyNowPage(driver);
		buyNow.getConfirmProductName();
		buyNow.clickOnBuyNowButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		FlipKart4LoginPage loginPage = new FlipKart4LoginPage(driver);
		loginPage.enterMobileNumber("9999000090");
		Thread.sleep(1000);
		loginPage.clickOnContinueButton();
		
	}

}
