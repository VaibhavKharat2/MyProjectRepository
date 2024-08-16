package tableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		int row = driver.findElements(By.xpath("//table[@class='table-display']//tr")).size();
		int col = driver.findElements(By.xpath("//table[@class='table-display']//tr[1]/th")).size();
		
		for(int i=1; i<=row;i++) {
			
			if(i==1) {
				
				for(int j=1;j<=col;j++) {
					String text = driver.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(text+"  ");
				}
			}else {
				for(int j=2;j<=col;j++) {
					
					String text = driver.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"  ");
				}
			}
			System.out.println();
		}
		
	}

}
