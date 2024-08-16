package tableStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 500).perform();
		
		for(int i=2; i<=11; i++) {
			
			
					
			WebElement rows = driver.findElement(By.xpath("(//table[@name='courses'])//tr["+i+"]/td[2]"));
				System.out.println(rows.getText());
			
			
//			WebElement rows = driver.findElement(By.xpath("(//table[@name='courses'])//tr["+i+"]"));
//			System.out.println(rows.getText());
		}

	}

}
