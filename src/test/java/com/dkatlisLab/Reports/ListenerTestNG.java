package com.dkatlisLab.Reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTestNG implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Started TestCase " );
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TestCase Success");

		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println("TestCase Failed "+ result);


	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("TestCase Skipped "+ result);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
