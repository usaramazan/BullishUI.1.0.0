package com.bullish.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{

    public LoginPage(){ PageFactory.initElements(driver,this); }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),'You logged into a secure area!')]")
    public WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'Your password is invalid!')]")
    public WebElement invalidPasswordMessage;

    @FindBy(xpath = "//*[contains(text(),'Your username is invalid!')]")
    public WebElement invalidUsernameMessage;

    @FindBy(xpath = "//*[@id='content']/div/a")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[contains(text(),'You logged out of the secure area!')]")
    public WebElement loggedOutMessage;

    @FindBy(xpath = "//*[@class='flash error']")
    public WebElement errorMessage;
}
