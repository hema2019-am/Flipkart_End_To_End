package com.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@CucumberOptions(monochrome = true,features = "src/main/resources/Features",glue = {"com.StepDefination","com.Hooks"},
//        plugin = {"pretty",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags = "@tc002")
//public class Runner {
//
//}



@CucumberOptions(

        features = "src/main/resources/Features",
        glue = {"com.StepDefination","com.Hooks"},
        plugin = {
                "html:src/main/resources/Reports/cucumber-reports.html",
                "json:src/main/resources/Reports/cucumber.json",
                "testng:src/main/resources/Reports/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty",
        },tags = "@Regression"
)
public class Runner extends AbstractTestNGCucumberTests {
}
