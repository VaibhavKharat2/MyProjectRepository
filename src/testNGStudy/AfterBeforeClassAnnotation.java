package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterBeforeClassAnnotation {
	
  @Test
  public void f() {
	  Reporter.log("Test f1 methods",true);
  }
  
  @BeforeMethod
  public void f1() {
	  Reporter.log("Before methods",true);  
  }
  
  @AfterMethod
  public void f2() {
	  Reporter.log("After methods",true);
  }
  
  @BeforeClass
  public void f3() {
	  Reporter.log("Before class",true);
  }
  
  @AfterClass
  public void f4() {
	  Reporter.log("After class",true);
  }
  
  @Test
  public void f5() {
	  Reporter.log("2nd test methods",true);
  }
  @BeforeMethod
  public void f6() {
	  Reporter.log("another before methods",true);
  }
}
