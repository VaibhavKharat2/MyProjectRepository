package pomClassWithExcel;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCaseValidatation {
	
	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]")
	private WebElement text;
	
	@FindBy(id = "plans-list")
	private List<WebElement> totalPlan;
	
	public TestCaseValidatation(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateTestCase() {
		
		String[] textarray = text.getText().split(" ");
		String givenText = textarray[0];
		
		int givenNum=Integer.parseInt(givenText);
		
		int plans=totalPlan.size();
		
		if(givenNum == plans) {
			System.out.println("passed test case");
		}else {
			System.out.println("failed test case");
		}
	}
}
