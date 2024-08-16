package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		Thread.sleep(1000);
		//act.dragAndDrop(src, dest).perform();
		
		act.scrollToElement(dest);
 
	}

}
