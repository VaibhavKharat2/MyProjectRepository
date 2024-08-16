package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationStudy {
	
	//It runs in an methods alphabetical orders
	//before and after run before an after for every methods

	@Test
	public void main() {
		Reporter.log("first methods",true);
	}
  
	@Test
	  public void f() {
		 // System.out.println("f methosds");
		  Reporter.log("f methods of a test",true);
	  }
  
  
	@BeforeMethod
  public void f1() {
	  //System.out.println("before methods");
	  Reporter.log(" before methods", true);
  }
  
  @AfterMethod
  public void f2() {
	  Reporter.log("after methods", true);
  }
  
  @Test
  public void f4() {
	 Reporter.log("second methods",true); 
  }
}
