package pomClassStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxFullPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.findElement(By.xpath("//div[text()='Male']")).click();
		
		driver.findElement(By.className("next-btn")).click();
		
		Thread.sleep(330);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='Age-You']"));
		Select s = new Select(dropDown);
		s.selectByValue("26y");
		
		driver.findElement(By.xpath("//div[@class='next-btn']")).click();
		
		driver.findElement(By.className("mp-input-text")).sendKeys("445204");
		
		driver.findElement(By.xpath("//input[@id='want-expert']")).sendKeys("9067044164");
		
		driver.findElement(By.className("next-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		Thread.sleep(3000);
		String myText =

		driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();

		String[] ar = myText.split(" ");
		String numberInString = ar[0];
		int result = Integer.parseInt(numberInString);
		System.out.println("matching number "+result);
		List<WebElement> banners =

		driver.findElements(By.xpath("//div[@class='plan-card-container']"));

		int NumberOfBanners = banners.size();
		System.out.println("Total banners "+NumberOfBanners);
		if (result == NumberOfBanners) {
		System.out.println("Result is matching TC is passed");
		} else {
		System.out.println("Result is not matching TC is failed");
		}
		
//		String text=driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();
//		
//		String[] arr = text.split(" ");
//		String num = arr[0]; 
//		int variable=Integer.parseInt(num);
//		
//		List<WebElement> list = driver.findElements(By.id("plans-list"));
//		int size = list.size();
//		
//		if(size == variable) {
//			System.out.println("test case is passed");
//		}else {
//			System.out.println("test case is failed");
//		}
//		
		
		
		
		
		
		
	}

}
