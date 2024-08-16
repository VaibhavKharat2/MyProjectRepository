package coverfoxUsingPomAndTestng;

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

public class CoverFox6TestCases {

	WebDriver driver;
	CoverFox1HomePage homePage;
	CoverFox2HealthPlanPage healthPlanPage;
	CoverFox3MemberDetailsPage memberDetailsPage;
	Coverfox4AddressDetailsPage addressDetailsPage;
	CoverFox5ResultPage resultPage;

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
		resultPage = new CoverFox5ResultPage(driver);

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

		addressDetailsPage.EnterAddressDetails(CoverFoxUtility.getDataFromExcell(0, 1),
				CoverFoxUtility.getDataFromExcell(0, 2));
		addressDetailsPage.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	@Test
	public void validateBanners() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		int planNumFromBanner = resultPage.getListOfPlanNumberFromBanner();
		int planNumFromText = resultPage.getPlansNumberFromText();
		Assert.assertEquals(planNumFromText, planNumFromBanner, "plan and list of banners total not matching");
	}

	@Test
	public void validateTestPlanElement() {
		Assert.assertTrue(resultPage.checkSortPlanElement(), "element is not present, test case failed");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
