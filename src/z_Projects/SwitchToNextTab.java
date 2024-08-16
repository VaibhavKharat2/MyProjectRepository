package z_Projects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToNextTab {

	public void switchTab(WebDriver driver) {

		Set<String> list = driver.getWindowHandles();

		Iterator<String> it = list.iterator();
		String main = it.next();
		String child = it.next();

		driver.switchTo().window(child);
	}

}
