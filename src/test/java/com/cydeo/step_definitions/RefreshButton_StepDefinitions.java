package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshButton_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
    VehiclesPage vehiclesPage = new VehiclesPage();
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



}
