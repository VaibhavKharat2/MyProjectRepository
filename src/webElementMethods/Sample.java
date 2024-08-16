package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		System.out.println(ele.isEnabled());
		
		WebElement ele1 = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(ele1.isSelected());
		
		Thread.sleep(500);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(500);
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		System.out.println(ele2.isDisplayed());
	}

}
