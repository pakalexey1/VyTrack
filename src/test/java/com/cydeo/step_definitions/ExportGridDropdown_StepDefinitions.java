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

public class ExportGridDropdown_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    DashboardPage dashboardPage = new DashboardPage();

    @Given("Track_Driver_first is on the vehicle page")
    public void track_driver_firstIsOnTheVehiclePage() {
        VyTrackUtils.login("truck_driver.username1", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @When("user clicks on Export Grid dropdown button")
    public void user_clicks_on_export_grid_dropdown_button() throws InterruptedException {
        VehiclesPage vehiclesPage = new VehiclesPage();
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdownButton));
        vehiclesPage.exportGridDropdownButton.click();
    }

    @Then("user should see two options: CSV and XLSX")
    public void user_should_see_two_options_csv_and_xlsx() {
        VehiclesPage vehiclesPage = new VehiclesPage();

        Assert.assertTrue(vehiclesPage.csvButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.xlsxButton.isDisplayed());
        vehiclesPage.logout();
    }

    @Given("Track_Driver_second is on the vehicle page")
    public void track_driver_secondIsOnTheVehiclePage() {
        VyTrackUtils.login("truck_driver.username2", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Track_Driver_third is on the vehicle page")
    public void track_driver_thirdIsOnTheVehiclePage() {
        VyTrackUtils.login("truck_driver.username3", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Store_Manager_first is on the vehicle page")
    public void store_manager_firstIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username1", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Store_Manager_second is on the vehicle page")
    public void store_manager_secondIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username2", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Store_Manager_third is on the vehicle page")
    public void store_manager_thirdIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username3", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_first is on the vehicle page")
    public void sales_manager_firstIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username1", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_second is on the vehicle page")
    public void sales_manager_secondIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username2", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_third is on the vehicle page")
    public void sales_manager_thirdIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username3", "password");
        VyTrackUtils.goToVehiclesPage();
    }
}
