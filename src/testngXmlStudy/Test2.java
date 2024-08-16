package testngXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void e() {
		Reporter.log("E methods is run",true);
	}

	@Test
	public void g() {
		Reporter.log("G methods is run",true);
	}

	@Test
	public void f() {
		Reporter.log("F methods is run",true);
	}

	@Test
	public void h() {
		Reporter.log("H methods is run",true);
	}

}
