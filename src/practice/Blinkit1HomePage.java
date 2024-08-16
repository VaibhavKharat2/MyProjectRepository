package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blinkit1HomePage {

	@FindBy(className = "SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS")
	private WebElement searchField;

	public Blinkit1HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void enterInSearchField() {

		searchField.sendKeys("Dairy Milk");
	}

}
