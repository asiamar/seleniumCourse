package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart (ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess (ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure (ITestResult result) {
		System.out.println("test failed" + " nazwa testu - "+ result.getName());
	}
	
	@Override
	public void onTestSkipped (ITestResult result) {
		
	}
	
}
