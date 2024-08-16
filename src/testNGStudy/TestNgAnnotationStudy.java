package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationStudy {


	
	@Test(invocationCount = 2,dependsOnMethods = "ValidateUserId")//,enabled = false)
	public void ValidatePin() {
	Reporter.log("Test1 Methods", true);
	}
	@Test //(priority = -3)//timeOut = 500)
	public void ValidateUserId() throws InterruptedException {
		//Thread.sleep(2000);
	Reporter.log("Test2 methods", true);
	}
	@BeforeMethod
	public void EnterUserIdAndPassword() {
	Reporter.log("before methods",true);
	}
	@AfterMethod
	public void Logout() {
	Reporter.log("After metjods", true);
	}
	@BeforeClass
	public void BrowserLaunch() {
	Reporter.log("before class", true);
	}
	@AfterClass
	public void CloseBrowser() {
	Reporter.log("After class", true);
	}
	
}
