package testngXmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgFailedreport {

	@Test
	public void a() {
		Reporter.log("a runs",true);
	}
	
	@Test
	public void b() {
		//Assert.fail();
		Reporter.log("b runs",true);
	}
	
	@Test
	public void c() {
		//Assert.fail();
		Reporter.log("c runs",true);
	}
	
	@Test
	public void d() {
		Reporter.log("d runs",true);
	}
}
