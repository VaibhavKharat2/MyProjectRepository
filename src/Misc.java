import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("software engineer");
		Thread.sleep(4000);
		
		List<WebElement> search1 = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(int i=0; i<search1.size();i++) {
			
		//	System.out.println(search1.get(i).getText());
			
			if(search1.get(i).equals("software engineer")) {
				search1.get(i).click();
				break;
			}
		}
		
		
	
//		System.out.println("----------------------");
//		
//		for(WebElement al:search1) {
//			System.out.println(al.getText());	
//		}
//		
//		System.out.println("---------------------------");
//		
//		Iterator<WebElement> a1 = search1.iterator();
//		while(a1.hasNext()) {
//			System.out.println(a1.next().getText());
//		}
	}

}
