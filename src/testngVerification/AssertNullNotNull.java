package testngVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {

	@Test
	public void f() {
		
		String s ="shubham";
		String s1="";//this will not consider null values only null is consider
		String s2=null;
		
		Assert.assertNull(s2,"it is not null");
		Assert.assertNotNull(s,"it contain null value");
		
		//It has only one test theirefor only one test
		
		Assert.fail();//it fails the test case 
	}
}
