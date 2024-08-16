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

public class CoverFox5ValidateErrorMassage {

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
		
		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(1, 1),
				CoverFoxUtility.getDataFromExcell(1, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}
	@Test
	public void validateErrorMassageOfPinCode() {
	String massage = "Please enter a valid pincode";
	Assert.assertEquals(massage,addressDetailsPage.getErrorMassageOfPinCode(),"not getting exact error massage test case failed");
	}
	
	@Test
	public void validateErrorMassageOfMobNo() {
		String massage =  "Please enter a valid mobile no.";
		Assert.assertEquals(massage, addressDetailsPage.getErrorMassageOfMobNumber(),"not getting exact error massage,failed test case");
	}


	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}

