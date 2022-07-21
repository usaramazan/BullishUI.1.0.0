package com.bullish.stepDef;

import com.bullish.utilities.BrowsersUtils;
import com.bullish.utilities.ConfigReader;
import com.bullish.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks{

    @Before
    public void setup(){
        Driver.getDriver();
        BrowsersUtils.setWaitTime();
        Driver.driver.manage().window().maximize();
        Driver.driver.get(ConfigReader.getProperties("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach screenshot to the report
            scenario.embed(image, "image/png", scenario.getName());
        }

        Driver.driver.close();
    }
}
