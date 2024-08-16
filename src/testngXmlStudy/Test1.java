package testngXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void b() {
		Reporter.log("B methods is run",true);
	}

	@Test
	public void c() {
		Reporter.log("C methods is run",true);
	}

	@Test
	public void a() {
		Reporter.log("A method is run",true);
	}

	@Test
	public void d() {
		Reporter.log("D methods is run",true);
	}

}
