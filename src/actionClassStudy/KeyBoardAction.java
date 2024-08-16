package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(400);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Actions action = new Actions(driver);
		action.sendKeys(name, "Vaibhav").perform();
		
		action.keyDown(name, Keys.SHIFT).sendKeys("Vaibhav").keyUp(Keys.SHIFT).build().perform();		/*
act.keyDown(nameField,

Keys.SHIFT).sendKeys("velocity").keyUp(Keys.SHIFT).build().perform();
		 */
	}

}
