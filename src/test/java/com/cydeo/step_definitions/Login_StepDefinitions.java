package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the VyTrack login page")
    public void user_is_on_the_vy_track_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        loginPage.loginWithCredentials(username, password);
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        BrowserUtils.getWait10().until(ExpectedConditions.titleContains(ConfigurationReader.getProperty("dashboard")));
        Assert.assertEquals("Dashboard verification failed", ConfigurationReader.getProperty("dashboard"), Driver.getDriver().getTitle() );
        basePage.logout();
    }
}
