package tableStudy;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 500).perform();
		
		List<WebElement> list = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr"));
		
		System.out.println("no of rows "+list.size());
		
		List<WebElement> col = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr[1]/th"));
		
		System.out.println(col.size());
		
		
		for(int i=1; i<=3; i++) {
			
		WebElement data=driver.findElement(By.xpath("(//table[@name='courses'])//tr/th["+i+"]"));
		
		String s = data.getText();
		System.out.println(s);
			
		}
		
		
		
		
//		Iterator<WebElement> it=list.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next().getText());
//		}
		
		

	}

}
