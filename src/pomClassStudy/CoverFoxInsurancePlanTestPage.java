package pomClassStudy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxInsurancePlanTestPage {

	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]")
	private WebElement text;
	
	@FindBy(xpath = "//div[@id='plans-list']")
	private List<WebElement> totalPlan;
	
	public CoverFoxInsurancePlanTestPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validatePlans() {
		
		String[] num = text.getText().split(" ");
		int totalNum=Integer.parseInt(num[0]);
		
		int totalplanSize=totalPlan.size();
		
		if(totalNum == totalplanSize)
			System.out.println("test case passed");
		else
			System.out.println("test case failed");
	}
}

