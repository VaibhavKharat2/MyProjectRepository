package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
	
	//Its defualt value is true 
	//if you dont want to execute any test case then used 
	//ebabled=false.
	
	//(enabled=false)  it will ignored methods

	@Test(enabled = false)
	public void a() {
		Reporter.log("a is running", true);
	}
	
	@Test(enabled =false)
	public void b() {
		Reporter.log("b is running", true);
	}
	
	@Test
	public void c() {
		Reporter.log("c is running", true);
	}
	
	@Test
	public void d() {
		Reporter.log("d is running", true);
	}
}
