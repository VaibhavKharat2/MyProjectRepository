package pomClassStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxResultPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnGenderButton();
		Thread.sleep(500);
		
		CoverFoxHealthPlan health = new CoverFoxHealthPlan(driver);
		health.clickOnNextButton();
		Thread.sleep(500);
		
		CoverFoxMemberDetail member = new CoverFoxMemberDetail(driver);
		member.selectAgeDropDown();
		member.clickOnNextButton();
		
		CoverFoxAddressDetailPage details = new CoverFoxAddressDetailPage(driver);
		
		details.enterDetails();
		details.clickOnContinueButton();
		
		CoverFoxInsurancePlanTestPage test =  new CoverFoxInsurancePlanTestPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		test.validatePlans();
		
		

	}

}
