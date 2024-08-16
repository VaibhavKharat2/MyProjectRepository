package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	//dependent methods run first 

	//@Test(dependsOnMethods = {"c","b"})//sequence wise
	@Test(dependsOnMethods = {"b"})
	public void a() {
		Reporter.log("A methods is run",true);
	}
	
	@Test(dependsOnMethods = {"c"})
	public void b() {
		Reporter.log("B methods is run",true);
	}
	

	@Test
	public void c() {
		Reporter.log("C methods is run",true);
	}
	
	
}
