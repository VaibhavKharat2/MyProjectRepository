package coverFox3Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFox1Base.Base;
import coverFox2Pom.CoverFox1HomePage;
import coverFox2Pom.CoverFox2HealthPlanPage;
import coverFox2Pom.CoverFox3MemberDetailsPage;
import coverFox2Pom.CoverFox5ResultPage;
import coverFox2Pom.Coverfox4AddressDetailsPage;
import coverFox4Utility.Utility;

@Listeners(coverFox4Utility.Listener.class)
public class CoverFoxTestCase extends Base {

	CoverFox1HomePage homePage;
	CoverFox2HealthPlanPage healthPlanPage;
	CoverFox3MemberDetailsPage memberDetailsPage;
	Coverfox4AddressDetailsPage addressDetailsPage;
	CoverFox5ResultPage resultPage;

	@BeforeTest
	public void lounchBrowser() {
		openBrowser();
		homePage = new CoverFox1HomePage(driver);
		healthPlanPage = new CoverFox2HealthPlanPage(driver);
		memberDetailsPage = new CoverFox3MemberDetailsPage(driver);
		addressDetailsPage = new Coverfox4AddressDetailsPage(driver);
		resultPage = new CoverFox5ResultPage(driver);

	}

	@BeforeClass
	public void preConditions() throws EncryptedDocumentException, IOException, InterruptedException {
		Utility.takeScreenShot(driver, "homePage");
		homePage.clickOnGenderButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		Utility.takeScreenShot(driver, "healthPlanPage");
		healthPlanPage.clickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3500));

		//memberDetailsPage.selectAge(Utility.getDataFromExcell(0, 0,"Sheet4"));
		memberDetailsPage.selectAge(Utility.getDataFromPropertyFile("age"));
		Thread.sleep(2000);
		memberDetailsPage.clickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		//addressDetailsPage.EnterAddressDetails(Utility.getDataFromExcell(0, 1,"Sheet4"), Utility.getDataFromExcell(0, 2,"Sheet4"));
		addressDetailsPage.EnterAddressDetails(Utility.getDataFromPropertyFile("pinCode"), Utility.getDataFromPropertyFile("mobNo"));
		
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	@Test
	public void validateBanners() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));

		int planNumFromBanner = resultPage.getListOfPlanNumberFromBanner();
		int planNumFromText = resultPage.getPlansNumberFromText();
		Assert.assertEquals(planNumFromText, planNumFromBanner, "plan and list of banners total not matching");
		//Utility.takeScreenShot(driver, "validateBanners");
	}

	@Test
	public void validateTestPlanElement() {
		Assert.fail();
		Assert.assertTrue(resultPage.checkSortPlanElement(), "element is not present, test case failed");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		browserClose();

	}
}
