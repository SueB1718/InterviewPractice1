package com.bookit.step_definitions;

import com.bookit.utilities.BrowserUtil;
import com.bookit.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.logging.Level;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("----------Setting up browser with further details...");

    }


    @After
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()){
            byte[]screenShot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName());
        }
        BrowserUtil.sleep(1);
        Driver.closeDriver();
    }

    @BeforeStep
    public void runBeforeStep(){
        System.out.println("--------------Running Before Each STEP------------------");
    }
    @AfterStep
    public void runAfterStep(){
        System.out.println("-----------------Running After Each STEP");
    }
}


