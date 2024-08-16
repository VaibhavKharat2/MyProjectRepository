package setSizeOfBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size);
		
		//to set the size of a browser we need to create dimension object
		
		Dimension d = new Dimension(1300, 800);
		
		driver.manage().window().setSize(d);

	}

}
