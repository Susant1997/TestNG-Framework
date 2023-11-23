package org.test.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLogic implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method Sucess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method Sucess %");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Class Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Class Finished");
		
	}

}
