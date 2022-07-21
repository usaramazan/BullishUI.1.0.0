package com.bullish.pages;


import com.bullish.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*This class will be extended by page classes
And common webelements/locators can be stored here
Since navigation menu doesn't belong to particular page
We cannot really create a dedicated page class to store
 elements from that menu
         */
public class TestBase {

    public WebDriver driver = Driver.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public TestBase() {
        PageFactory.initElements(driver, this);
    }
}
