package chromeOption;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionUse {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
//		option.addArguments("start-maximized");
//		option.addArguments("incognito");
//		option.addArguments("disable-notifications");
//		option.addArguments("disable-popup-blocking");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("start-maximized");
		al.add("incognito");
		al.add("disable-notifications");
		al.add("disable-popup-blocking");
		
		option.addArguments(al);
		
	
			WebDriver driver = new ChromeDriver(option);
			
			driver.get("https://www.justdial.com/");
			
	}

}
