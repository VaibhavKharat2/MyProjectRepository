package testngVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {

	@Test
	public void f() {
		boolean a = true;
		boolean b = false;
		
		//Assert.assertTrue(a, "values is  false ,case failed");
		Assert.assertFalse(b, "value is true ,failed test");
		
		//if one test case is failed all failed
	}
}
