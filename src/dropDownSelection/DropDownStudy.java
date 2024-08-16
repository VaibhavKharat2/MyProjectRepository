package dropDownSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.cssSelector("input#name"));
		name.sendKeys("Vaibhav Kharat");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vaibhav123@gmail.com");
		Thread.sleep(2000);
		
		WebElement gender=driver.findElement(By.name("gender"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement mobno = driver.findElement(By.cssSelector("input[id='mobile']"));
		mobno.sendKeys("9329399399");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.cssSelector("input#dob"));
		date.sendKeys("20032000");
		Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.cssSelector("input.form-control[name='subjects']"));
		subject.sendKeys("admission form");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		
		WebElement address=driver.findElement(By.cssSelector("textarea#picture"));
		address.sendKeys("Pusad Maharashtra");
		Thread.sleep(2000);
		
		WebElement state=driver.findElement(By.id("state"));
		Thread.sleep(2000);
		Select s = new Select(state);
		s.selectByValue("NCR");
		//s.selectByVisibleText("Uttar Pradesh");
		//s.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.cssSelector("select#city"));
		Select s1 = new Select(city);
		s1.selectByValue("Lucknow");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		
	}

}
