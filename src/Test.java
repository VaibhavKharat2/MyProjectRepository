import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) {
		

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vaibhav");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kharat");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vaibhavkhart33@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vaibhavkhart33@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vaibhav@123");

		
	}

}


