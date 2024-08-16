package pomClassWithExcel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.Utility;

public class ResultCoverfox {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		String filePath = "C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx";
		String age=Utility.dataFromExcell(filePath,"Sheet6", 0, 0);
		String pincode = Utility.dataFromExcell(filePath,"Sheet6", 0, 1);
		String mobnum = Utility.dataFromExcell(filePath,"Sheet6", 0, 2);
		
		HomePageCoverFox home = new HomePageCoverFox(driver);
		home.selectGender();
		
		HealthPlanCoverFox healthPlan = new HealthPlanCoverFox(driver);
		healthPlan.clickOnNextButton();
		
		MemberDetailsCoverFox memberDetail = new MemberDetailsCoverFox(driver);
		memberDetail.selectAgeDropDown(age);
		
		AddressDetailCoverFox adressDetail = new AddressDetailCoverFox(driver);
		adressDetail.enterAddressDetais(pincode, mobnum);
		adressDetail.clickOnNextButton();
		
		TestCaseValidatation validate = new TestCaseValidatation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		validate.validateTestCase();
		
		

	}

}
