package testNgListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListenerStudy.Listener.class)
public class MyClass {
	
	@Test(dependsOnMethods = "b")
	public void a() {
		Reporter.log("a is running ", true);
	}
	
	@Test
	public void b() {
		
		Assert.fail("failed methods");
		Reporter.log("b is running ", true);
	}
	
	@Test
	public void c() {
		Reporter.log("c is running ", true);
	}
	
	@Test
	public void d() {
		Reporter.log("d is running ", true);
	}

}
