package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmezonSearchField {

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid="
				+ "155259815513&hvpone=&hvptwo"
				+ "=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13601230699551060055&hvqmt"
				+ "=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154213&hvtargid=kwd-10573980&hydadcr=14453"
				+ "_2316415&gad_source=1");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motorola edge 40 new");
		Thread.sleep(1000);
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']//div[@class='s-suggestion-container']"));

		//System.out.println(list.size());
		
		String s = "motorola edge 40 new mobile";
		
		for(int i=0; i<list.size();i++) {
			
			String s1 = list.get(i).getText();
			
			if(s.equalsIgnoreCase(s1)) {
				
				list.get(i).click();
			}
			
			//System.out.println(list.get(i).getText());
		}

	}

}
