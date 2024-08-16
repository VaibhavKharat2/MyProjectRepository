package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipleKeyword {
	
	@Test
	public void a() {
		Reporter.log("A methods is run",true);
	}
	

	@Test(invocationCount = 3, enabled = true)
	public void b() {
		Reporter.log("B methods is run",true);
	}
	

	@Test(invocationCount = 3,priority = -1)
	public void c() {
		Reporter.log("C methods is run",true);
	}
}
