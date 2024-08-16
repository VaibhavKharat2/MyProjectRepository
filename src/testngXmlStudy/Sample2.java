package testngXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(groups = {"sanity"})
	public void e() {
		Reporter.log("E methods is run",true);
	}
	@Test(groups = {"regression"})
	public void f() {
		Reporter.log("F methods is run",true);
	}
	@Test(groups = {"sanity"})
	public void g() {
		Reporter.log("G methods is run",true);
	}
	@Test(groups = {"regression"})
	public void h() {
		Reporter.log("G methods is run",true);
	}

}
