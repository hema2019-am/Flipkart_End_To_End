package com.Hooks;

import com.Baseclass.Library;
import com.ReuseableFunction.SeleniumReusable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class hooks extends Library {

    public static Scenario scenario;
    SeleniumReusable se ;
    @Before
    public void before(Scenario Cucumberscenario) throws IOException {
      scenario = Cucumberscenario;
      launchApplication();
    }

    @After
    public void after() throws IOException {
        se = new SeleniumReusable(driver);
        se.AfterScreenshot(scenario);
        if (driver != null) {
            driver.quit();
        }
    }


}
