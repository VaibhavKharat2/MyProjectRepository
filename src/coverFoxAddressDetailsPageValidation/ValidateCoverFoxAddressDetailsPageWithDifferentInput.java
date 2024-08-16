package coverFoxAddressDetailsPageValidation;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import coverfoxUsingPomAndTestng.CoverFoxUtility;

public class ValidateCoverFoxAddressDetailsPageWithDifferentInput {

	WebDriver driver;
	CoverFox1HomePage homePage;
	CoverFox2HealthPlanPage healthPlanPage;
	CoverFox3MemberDetailsPage memberDetailsPage;
	Coverfox4AddressDetailsPage addressDetailsPage;

	@BeforeTest
	public void lounchBrowser() {

		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");

		driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		homePage = new CoverFox1HomePage(driver);
		healthPlanPage = new CoverFox2HealthPlanPage(driver);
		memberDetailsPage = new CoverFox3MemberDetailsPage(driver);
		addressDetailsPage = new Coverfox4AddressDetailsPage(driver);
	}

	@BeforeClass
	public void preConditions() throws EncryptedDocumentException, IOException, InterruptedException {

		homePage.clickOnGenderButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		healthPlanPage.clickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		memberDetailsPage.selectAge(CoverFoxUtility.getDataFromExcell(0, 0));
		Thread.sleep(2000);
		memberDetailsPage.clickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}

	@Test
	public void validateWithValidPinCodeAndMobNo()
			throws EncryptedDocumentException, IOException, InterruptedException {
		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(0, 1),
				CoverFoxUtility.getDataFromExcell(0, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		SoftAssert soft = new SoftAssert();
		soft.assertNull(addressDetailsPage.getErrorMassageOfPinCode(), "Invalid Pin Number");
		soft.assertNull(addressDetailsPage.getErrorMassageOfMobNumber(), "Invalid Mobile Number");
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test
	public void validateWithInvalidPinMobNum() throws EncryptedDocumentException, IOException, InterruptedException {
		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(1, 1),
				CoverFoxUtility.getDataFromExcell(1, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		SoftAssert soft = new SoftAssert();
		soft.assertNull(addressDetailsPage.getErrorMassageOfPinCode(), "Invalid Pin Number");
		soft.assertNull(addressDetailsPage.getErrorMassageOfMobNumber(), "Invalid Mobile Number");
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Test
	public void validateWithInvalidPinValidMobNum()
			throws EncryptedDocumentException, IOException, InterruptedException {
		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(2, 1),
				CoverFoxUtility.getDataFromExcell(2, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		SoftAssert soft = new SoftAssert();
		soft.assertNull(addressDetailsPage.getErrorMassageOfPinCode(), "Invalid Pin Number");
		soft.assertNull(addressDetailsPage.getErrorMassageOfMobNumber(), "Invalid Mobile Number");
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Test
	public void validateWithValidPinInvalidMobNo()
			throws EncryptedDocumentException, IOException, InterruptedException {
		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(1, 1),
				CoverFoxUtility.getDataFromExcell(1, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		SoftAssert soft = new SoftAssert();
		soft.assertNull(addressDetailsPage.getErrorMassageOfPinCode(), "Invalid Pin Number");
		soft.assertNull(addressDetailsPage.getErrorMassageOfMobNumber(), "Invalid Mobile Number");
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	//@AfterClass
//	public void closeBrowser() throws InterruptedException {
	//driver.close();
	//}
	

}
