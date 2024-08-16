package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		 WebElement redio=driver.findElement(By.id("dropdown-class-example"));
		 action.moveToElement(redio).click().build().perform();
		 
		// action.click(redio).perform();
	}

}
