package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		
		//contextClick() methods is used for performing right click operation
		
		//action.contextClick(rightClick).perforn();
		
		//without perform action it will not perform any action
		//action.moveToElement(rightClick).contextClick().build().perform();
		
		WebElement dClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		//action.moveToElement(dClick).doubleClick().build().perform();
		
		action.doubleClick(dClick).perform();
	}

}
