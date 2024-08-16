package testngVerification;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
//if we make it globally not identify the massage 
	//SoftAssert soft = new SoftAssert();
	@Test
	public void test() {
		
		//If we make soft asser object global it will failed all test
		//if one test is failed
		String a="Vaibhav";
		String b ="Shubham";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(a, b,"a and b are not equals");
		soft.assertNotNull(b,"b is not null");
		soft.assertAll();// it will send all report to testng,
		Reporter.log("bcjsjbcmns",true);
		//it is compulsory to wright
	}
	
	@Test
	public void test1() {
		boolean x = false;
		SoftAssert soft = new SoftAssert();
		soft.assertFalse(x, "x is true, TC failed");
		soft.assertAll();
		
		
	}
}
