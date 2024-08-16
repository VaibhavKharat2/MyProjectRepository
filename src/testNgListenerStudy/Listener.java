package testNgListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"Methods is started",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	 Reporter.log(result.getName()+"methods is successfull executed",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		 Reporter.log(result.getName()+"methods is skipped",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		 Reporter.log(result.getName()+"methods is failed",true);
	}
}
