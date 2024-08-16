package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
	
	@Test(invocationCount = 2)
	public void f() {
		Reporter.log("F methods is runns",true);
	}
	
	@Test(invocationCount = 3)
	public void f1() {
		Reporter.log("f1 is runns", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		Reporter.log("before methods", true);
	}

}
