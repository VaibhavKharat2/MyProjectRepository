package testngXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups = {"regression"})
	public void a() {
		Reporter.log("A methods is run",true);
	}
	@Test(groups = {"regression"})
	public void b() {
		Reporter.log("B methods is run",true);
	}
	@Test(groups = {"sanity"})
	public void c() {
		Reporter.log("C methods is run",true);
	}
	@Test(groups = {"sanity"})
	public void d() {
		Reporter.log("D methods is run",true);
	}

}
