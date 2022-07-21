package com.bullish.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PreLoginPage extends TestBase {


    public PreLoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(text(),'Form Authentication')]")
    public WebElement formAuthentication;

}
