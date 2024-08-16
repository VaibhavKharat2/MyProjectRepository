package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathType {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(200);
		
		
		
		//linketext and partial linked text
		//driver.findElement(By.linkText("Already have an account?")).click();
		//driver.findElement(By.partialLinkText("Already have")).click();
		
		
		
		
		
		
		
		//---------------------------------------------------------------------
		
		
		//driver.manage().window().maximize();  // to maximize the window of browser
		//-----------------------------
		//1 xpath be attribute
		 //  --- tagname[@attribute name = ‘attribute value’]
		
		// You can use attribute name as id, name as first preferance 
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Vaibhav");
		Thread.sleep(2000);
		//--------------------------------------
		//2 xpath by text
		//---  //tagname[text() = ‘textvalue’]
		// teke text to find xpath
		/*WebElement age=driver.findElement(By.xpath("//div[text() = 'Age']"));
		age.sendKeys("22");
		Thread.sleep(2000);
		*/
		//-------------------------------------
		//3 xpath by contains() -- half value istead of full used it if it is dynamic
		//a) contains with attribute  -- //tagname[contains(@attribute name, ‘attribute value’)]

		WebElement ln=driver.findElement(By.xpath("//input[contains(@id, 'u_0_d')]"));
		ln.sendKeys("kharat");
		Thread.sleep(2000);
		
		//b) contains with text --  //tagname[contains(text(),’textvalue’)]
		//used hald text value if text is too long
		
		WebElement loginButton=driver.findElement(By.xpath("//a[contains(text(), 'Already have')]"));
		Thread.sleep(2000);
		
		
		// 4  xpath by index
		//(//tagname[@attribute name = ‘attribute value’] )[2]
		//when attribute and its value are same
		
		WebElement gender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		Thread.sleep(2000);
		
		//5 Absolute and Relative xpath
		

		
		
		

		
		

		
		
		
		
		
	}

}
