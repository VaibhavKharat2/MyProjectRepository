package tableStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrickBuzzTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=scoreboard+ind+vs+eng+semifinal+2024&oq="
				+ "scoreboard+ind+vs+eng+semifinal+2024&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIJCAEQIRgKGKABMgkIAhAhGAoYoAEyCQgDECEYChi"
				+ "gAdIBCTI1NTE2ajBqN6gCCLACAQ&sourceid="
				+ "chrome&ie=UTF-8#cobssid=s&sie=m;/g/11vpfvpzgh;5;/m/026y268;cms;fp;1;;;");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(10, 400).perform();
		
		driver.findElement(By.xpath("(//div[text()='India'])[3]")).click();
		
		Thread.sleep(1000);
		
		for(int i=2; i<=10; i++) {
		
		String s =driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[1]/tbody["+i+"]/tr[2]")).getText();
		
		System.out.println(s);
		System.out.println();
		}
		
		
		//Header part
		/*for(int i=1; i<=7;i++) {
		String s1 = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[1]//th["+i+"]")).getText();
		
		System.out.print(s1);

		}
		System.out.println();
		*/
		
		
	}

}
