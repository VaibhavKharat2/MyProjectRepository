package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTask1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("samsung mobile 5g");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		search.submit();
		
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		
		Set<String> list = driver.getWindowHandles();
		
		 Iterator<String> it = list.iterator();
		 String main=it.next();
		 String child=it.next();
		 
		 driver.switchTo().window(child);
		 
		// driver.findElement(By.xpath("//button[text()='Buy Now']")).submit();
		 
		 System.out.println("1");
		 
		 
		//WebElement addtoCart = 
				driver.findElement(By.xpath("(//ul[@class='row']//button)[1]")).click();
		//act.click(addtoCart).perform();
		
		System.out.println("2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.xpath("(//div//button/span)[2]")).submit();
		System.out.println("3");
	}
	}









		 
//		//.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
//		 
//		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("0000000000");
//		 
//		 Thread.sleep(1000);
//		 
//		 WebElement cont = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span"));
//		 
//		 cont.click();
////		 System.out.println(driver.findElement(By.xpath("(//div[text()='₹18,800'])[1]")).getText());
////		
////		//driver.findElement(By.xpath("//input[@class='vn9L2C']")).click();
////		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
////		driver.findElement(By.xpath("//button[text()='Buy Now']")).submit();
//	}
//
//}
