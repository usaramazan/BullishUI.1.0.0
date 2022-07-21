package com.bullish.stepDef;

import com.bullish.pages.LoginPage;
import com.bullish.pages.PreLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStepDef {

    static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);
    SoftAssertions softly = new SoftAssertions();

    PreLoginPage preLoginPage = new PreLoginPage();
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to login page")
    public void navigate_to_login_page() {
        preLoginPage.formAuthentication.click();
    }

    @Given("Enter {string} as username")
    public void enter_as_username(String username) {
        loginPage.username.sendKeys(username);
    }

    @Given("Enter {string} as password")
    public void enter_as_password(String password) {
        loginPage.username.sendKeys(password);
    }

    @When("Click on login to submit")
    public void click_on_login_to_submit() {
        loginPage.loginButton.click();
    }

    @Then("Verify {string} success message is displayed")
    public void verify_message_is_displayed(String successMessage) {
        loginPage.successMessage.isDisplayed();
    }

    @When("Click on logout")
    public void click_on_logout() {
        loginPage.logoutButton.click();

    }

    @Then("Verify {string} log out message is displayed")
    public void verify_you_logged_out_of_the_secure_area_message_is_displayed() {
        loginPage.loggedOutMessage.isDisplayed();

    }

    @Then("Verify {string} fail message is displayed")
    public void verifyMessageFailMessageIsDisplayed(String expectedMessage) {
        String actualMessage = loginPage.errorMessage.getText();
        softly.assertThat(actualMessage).isEqualTo(expectedMessage);
    }

}
