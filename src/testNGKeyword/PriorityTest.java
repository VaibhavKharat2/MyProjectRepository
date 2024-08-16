package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {
	
	//Lowest the priority number execute first
	//default priority is zero
	//this annotation is not used other than test annotation
	
	@Test
	public void a() {
		Reporter.log("A methods is run",true);
	}
	
	@Test
	public void b() {
		Reporter.log("B methods is run",true);
	}
	
	@Test(priority = -2)
	public void d() {
		Reporter.log("D methods is run",true);
	}
	
	@Test(priority = -1)
	public void c() {
		Reporter.log("C methods is run",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		Reporter.log("before methods", true);
	}
	
	@AfterMethod
	public void aftermMthod() {
		
		Reporter.log("after methods", true);
	}

}
