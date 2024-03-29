package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.NoSuchElementException;

public class RefreshButton_StepDefinitions extends BasePage{
    VehiclesPage vehiclesPage = new VehiclesPage();

    BasePage basePage = new BasePage();
    Actions actions;


    @When("user clicks on All Cars dropdown button")
    public void user_clicks_on_all_cars_dropdown_button() {
        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.allCarsDropDownButton));
        vehiclesPage.allCarsDropDownButton.click();
    }

    @When("user clicks on Refresh button")
    public void user_clicks_on_refresh_button() throws InterruptedException {
        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshButton));
        vehiclesPage.refreshButton.click();
    }

    @Then("View Per Page dropdown options disappear")
    public void viewPerPageDropdownDisappears() throws InterruptedException {
        VyTrackUtils.waitFor(20);
        Assert.assertFalse(vehiclesPage.viewPerPage50Option.isDisplayed());

    }

    @When("user clicks on View Per Page Dropdown button")
    public void userClicksOnViewPerPageDropdownButton() throws InterruptedException {
        VyTrackUtils.waitFor(20);
        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.viewPerPageDropdown));
        vehiclesPage.viewPerPageDropdown.click();
        VyTrackUtils.waitFor(20);
        Assert.assertTrue(vehiclesPage.viewPerPage50Option.isDisplayed());
    }


    /**
     * Sasha's stuff below:
     **/

    @Given("user {string} enters {string} on the vehicle page")

    public void isOnTheVehiclePage(String username, String password) {
        VyTrackUtils.login(username, password);
        VyTrackUtils.goToVehiclesPage();
    }

    @When("user moves to Refresh button")
    public void user_moves_to_refresh_button() {

        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshButton));
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesPage.refreshButton).pause(1000).perform();

    }

    @Then("user can see Refresh button to the left side of Reset button")
    public void user_can_see_refresh_button_to_the_left_side_of_reset_button() {

        Assert.assertTrue(vehiclesPage.ifButtonOnTheXSide("left","Refresh", "Reset"));

        basePage.logout();
    }

    /**
     * Hanna's stuff:
     */
    @When("^user clicks on the Refresh button$")
    public void user_clicks_on_the_refresh_button() {
        getWait10().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Refresh']")));
        VehiclesPage vehiclesPage = new VehiclesPage();
        Assert.assertTrue(vehiclesPage.reset_button.isDisplayed());
        Assert.assertTrue(vehiclesPage.reset_button.isEnabled());
    }

    @Then("^user see page is refreshed$")
    public void user_see_page_is_refreshed() {
        VehiclesPage vehiclesPage = new VehiclesPage();
        boolean clicked = false;
        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.refresh_button));
        try {
            vehiclesPage.refresh_button.click();
            clicked = true;
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
        Assert.assertTrue(clicked);

        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            getWait10().until(expectation);
        } catch (Throwable error) {
            Assert.assertFalse("Timeout waiting for Page Load", true);
        }
        basePage.logout();
    }
}


