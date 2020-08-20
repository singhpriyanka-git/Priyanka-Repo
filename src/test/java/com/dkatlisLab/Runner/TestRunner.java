package com.dkatlisLab.Runner;


import java.io.*;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith.*; 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;
//import managers.FileReaderManager;
//import com.ntrs.msf.managers.FileReaderManager;



 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "feature",
 tags={"@Testcase1,@Testcase2"}
 ,glue={"com.dkatlisLab.StepDefnition"},
 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
 )
public class TestRunner  {
	
	@AfterClass
	 public static void writeExtentReport() throws Exception {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/dkatlisLab/config/config.properties");
		//prop.loadFromXML(ip);
		//System.out.println(ip);
		
	 }

}
