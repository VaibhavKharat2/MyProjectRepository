package coverFox3Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import coverFox1Base.HotelBase;
import coverFox2Pom.HotelBookingConfirmationPage;
import coverFox2Pom.HotelBookingPage;
import coverFox2Pom.HotelItenaryPage;
import coverFox2Pom.HotelLoginPage;
import coverFox2Pom.HotelSearchPage2;
import coverFox2Pom.HotelSelectionPage3;
import coverFox4Utility.Utility;

public class HotelBookingTestClass extends HotelBase {

	HotelLoginPage login;
	HotelSearchPage2 hotelSearch;
	HotelBookingPage bookingPage;
	HotelItenaryPage itenary;
	HotelSelectionPage3 hotelSelection;
	HotelBookingConfirmationPage confirmation;
	String confirmid;
	String resultId;

	@BeforeTest
	public void lounchBrowser() {
		openBrowser();

		login = new HotelLoginPage(driver);
		hotelSearch = new HotelSearchPage2(driver);
		bookingPage = new HotelBookingPage(driver);
		itenary = new HotelItenaryPage(driver);
		hotelSelection = new HotelSelectionPage3(driver);
		confirmation = new HotelBookingConfirmationPage(driver);
	}

	@BeforeClass
	public void preConditions() throws IOException, InterruptedException {

		login.enterCrediantials(Utility.getDataFromPropertyFile("Username"),
				Utility.getDataFromPropertyFile("Password"));
		login.clickOnLoginButton();
		Thread.sleep(2000);

		hotelSearch.selectLocation(Utility.getDataFromPropertyFile("Location"));
		hotelSearch.selectHotel(Utility.getDataFromPropertyFile("HotelName"));
		hotelSearch.roomType(Utility.getDataFromPropertyFile("RoomType"));
		hotelSearch.clickOnSearchButton();
		Thread.sleep(2000);

		hotelSelection.clickHotels();
		hotelSelection.clickOnContinueButton();
		Thread.sleep(2000);

		bookingPage.enterDetails("Barak", "Obama", "WhiteHouse", "1010101001010101", "323");
		bookingPage.cardType(Utility.getDataFromPropertyFile("cardType"));
		bookingPage.month(Utility.getDataFromPropertyFile("month"));
		bookingPage.year(Utility.getDataFromPropertyFile("year"));
		bookingPage.clickOnBookNow();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));

		confirmid = confirmation.getConfirmBookingId();
		confirmation.itineraryButton();
		Thread.sleep(2000);

		itenary.enterId(confirmid);
		itenary.clickOnGoButton();
		resultId = itenary.getReadId();
	}

	@Test
	public void validateTest() {

		Assert.assertEquals(confirmid, resultId, "both id is not matching failedTestCase");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		//browserClose();

	}

}
