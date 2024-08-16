package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutTest {
	
	//If methods is not execute at given time it fails  that
	//test case
	
	@Test(timeOut =500)
	public void a() throws InterruptedException  {
		Thread.sleep(1000);
		Reporter.log("A methods is run",true);
	}
	
	@Test
	public void b() {
		Reporter.log("B methods is run",true);
	}
	

}
