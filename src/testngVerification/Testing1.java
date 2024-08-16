package testngVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {

	@Test
	public void test1()
	{
	Reporter.log("test 1 methods is", true);
	Assert.fail(); //output- failed
	Reporter.log("test 1 methods is", true);
	}
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
	Reporter.log("test 2 methos is ", true); // output- Passed
	}
}
