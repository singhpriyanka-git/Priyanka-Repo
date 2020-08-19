package com.dkatlisLab.Runner;


import org.junit.runner.RunWith;
import org.junit.runner.RunWith.*; 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "feature",
 tags={"@Testcase1,@Testcase2"}
 ,glue={"com.dkatlisLab.StepDefnition"}
 )
public class TestRunner  {

}
