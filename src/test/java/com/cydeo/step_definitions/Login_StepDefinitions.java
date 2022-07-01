package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the VyTrack login page")
    public void user_is_on_the_vy_track_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));

    }

    @When("user enters track_driver_first username and password")
    public void userEntersTrack_driver_firstUsernameAndPassword() {
        loginPage.loginWithCredentials("truck_driver.username1", "password");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        wait.until(ExpectedConditions.titleContains(ConfigurationReader.getProperty("dashboard")));
        Assert.assertEquals("Dashboard verification failed", ConfigurationReader.getProperty("dashboard"), Driver.getDriver().getTitle() );
        loginPage.logout();
    }

    @When("user enters track_driver_second username and password")
    public void userEntersTrack_driver_secondUsernameAndPassword() {
        loginPage.loginWithCredentials("truck_driver.username2", "password");
    }

    @When("user enters track_driver_third username and password")
    public void userEntersTrack_driver_thirdUsernameAndPassword() {
        loginPage.loginWithCredentials("truck_driver.username3", "password");
    }

    @When("user enters store_manager_first username and password")
    public void userEntersStore_manager_firstUsernameAndPassword() {
        loginPage.loginWithCredentials("store_manager.username1", "password");
    }

    @When("user enters store_manager_second username and password")
    public void userEntersStore_manager_secondUsernameAndPassword() {
        loginPage.loginWithCredentials("store_manager.username2", "password");
    }

    @When("user enters store_manager_third username and password")
    public void userEntersStore_manager_thirdUsernameAndPassword() {
        loginPage.loginWithCredentials("store_manager.username3", "password");
    }

    @When("user enters sales_manager_first username and password")
    public void userEntersSales_manager_firstUsernameAndPassword() {
        loginPage.loginWithCredentials("sales_manager.username1", "password");
    }

    @When("user enters sales_manager_second username and password")
    public void userEntersSales_manager_secondUsernameAndPassword() {
        loginPage.loginWithCredentials("sales_manager.username2", "password");
    }

    @When("user enters sales_manager_third username and password")
    public void userEntersSales_manager_thirdUsernameAndPassword() {
        loginPage.loginWithCredentials("sales_manager.username3", "password");
    }
}
