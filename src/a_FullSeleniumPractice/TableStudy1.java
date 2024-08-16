package a_FullSeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableStudy1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500);
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println(row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		System.out.println(column.size());
		
		//-------how to read column row
		
		for(int i=1; i<=row.size();i++) {
			WebElement rowdata= driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]"));
		//	System.out.println(rowdata.getText());	
		}
	//	System.out.println("---------------------------------------------------------------------");
		for(int i=1; i<=column.size();i++) {
		WebElement	colData=driver.findElement(By.xpath("//table[@name='courses']//tr[1]/th["+i+"]"));
			//System.out.println(colData.getText()+"  ");
			
		}
		
		//----------------------------------------------------------------------------------------
		
		//How to read all data excluding header files
		
		//for header data
		
		for(int i=1; i<=column.size();i++) {
			
			WebElement header=driver.findElement(By.xpath("//table[@name='courses']//tr[1]/th["+i+"]"));
			//System.out.println(header.getText()+" ");
		}
		System.out.println("----------------------------------------------------");
		
		//all table rows and columns
		
		for(int i=2;i<=row.size();i++) {
			
			for(int j=1; j<=column.size();j++) {
				
				WebElement ele = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]"));
			
			//	System.out.print(ele.getText()+" ");
			}
			//System.out.println();
		}
		//================================================================================================
		
		
		
	}

}
