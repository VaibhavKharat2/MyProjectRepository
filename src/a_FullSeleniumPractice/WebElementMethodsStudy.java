package a_FullSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsStudy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);

		// sendKeys method is used to send data to the inputFields
		WebElement nameField = driver.findElement(By.xpath("//input[@id='email']"));
		nameField.sendKeys("Vaibhav");
		Thread.sleep(100);
		
		nameField.clear();
		//clear methods is clear the text in the input fields
		
		WebElement button = driver.findElement(By.xpath("//button[@id='u_0_5_L6']"));
		button.click();
		//click methods is used to click on button
		
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.className("_9ay7"));
		String s=text.getText();
		System.out.println(s);

	}

}
