package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VehiclesPage;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class RefreshButton_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    VehiclesPage vehiclesPage = new VehiclesPage();

    BasePage basePage = new BasePage();
    Actions actions;

    @Given("Truck_Driver_first is on the vehicle page")
    public void truck_driver_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver.username1", "password");
        //DashboardPage dashboardPage = new DashboardPage();
        //wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.vehiclesOption));
        VyTrackUtils.goToVehiclesPage();
    }

    @When("user clicks on All Cars dropdown button")
    public void user_clicks_on_all_cars_dropdown_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.allCarsDropDownButton));
        vehiclesPage.allCarsDropDownButton.click();
    }

    @When("user clicks on Refresh button")
    public void user_clicks_on_refresh_button() {
        vehiclesPage.refreshButton.click();
    }

    @Then("All Cars dropdown option disappears")
    public void all_cars_dropdown_option_disappears() {
        Assert.assertTrue(!vehiclesPage.allCarsOption.isDisplayed());
    }

    @Given("Truck_Driver_second is on the vehicle page")
    public void truck_driver_second_is_on_the_vehicle_page() {

    }

    @Given("Truck_Driver_third is on the vehicle page")
    public void truck_driver_third_is_on_the_vehicle_page() {

    }

    @Given("StoreManager_first is on the vehicle page")
    public void store_manager_first_is_on_the_vehicle_page() {

    }

    @Given("StoreManager_second is on the vehicle page")
    public void store_manager_second_is_on_the_vehicle_page() {

    }

    @Given("StoreManager_third is on the vehicle page")
    public void store_manager_third_is_on_the_vehicle_page() {

    }

    @Given("SalesManager_first is on the vehicle page")
    public void sales_manager_first_is_on_the_vehicle_page() {

    }

    @Given("SalesManager_second is on the vehicle page")
    public void sales_manager_second_is_on_the_vehicle_page() {

    }

    @Given("SalesManager_third is on the vehicle page")
    public void sales_manager_third_is_on_the_vehicle_page() {

    }

    /**
     * Sasha's stuff below:
     **/
    @Given("{string} {string}  is on the vehicle page")
    public void isOnTheVehiclePage(String username, String password) {

        VyTrackUtils.login(username, password);
        VyTrackUtils.goToVehiclesPage();

    }

    @When("user moves to Refresh button")
    public void user_moves_to_refresh_button() {

        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshButton));
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesPage.refreshButton).pause(3000).perform();

    }

    @Then("user can see Refresh button to the left side of Reset button")
    public void user_can_see_refresh_button_to_the_left_side_of_reset_button() {

        Assert.assertTrue(vehiclesPage.ifButtonOnTheLeft("Refresh", "Reset"));

        basePage.logout();
    }

    /**
     * Hanna's stuff:
     */
    @When("^user clicks on the Refresh button$")
    public void user_clicks_on_the_refresh_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Refresh']")));
        VehiclesPage vehiclesPage = new VehiclesPage();
        Assert.assertTrue(vehiclesPage.reset_button.isDisplayed());
        Assert.assertTrue(vehiclesPage.reset_button.isEnabled());
    }

    @Then("^user see page is refreshed$")
    public void user_see_page_is_refreshed() {
        VehiclesPage vehiclesPage = new VehiclesPage();
        boolean clicked = false;
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refresh_button));
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
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.assertFalse("Timeout waiting for Page Load", true);
        }
        VyTrackUtils.vyTrack_logout();
    }
}


