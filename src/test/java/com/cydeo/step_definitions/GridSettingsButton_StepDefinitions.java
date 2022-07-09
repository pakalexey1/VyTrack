package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSettingsButton_StepDefinitions {
    BasePage basePage = new BasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("TruckDriver_GridBtn_first is on the vehicle page")
    public void truck_driver_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver_username1", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("user can see Grid Settings button and click")
    public void user_can_see_grid_settings_button_and_click() {

        BrowserUtils.getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.gridSettingsButton));
        Assert.assertTrue(vehiclesPage.gridSettingsButton.isDisplayed());

        vehiclesPage.gridSettingsButton.click();
        Assert.assertTrue(vehiclesPage.gridSettingsDropdown.isDisplayed());

        basePage.logout();
    }


    @Given("TruckDriver_GridBtn_second is on the vehicle page")
    public void truck_driver_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver_username2", "password");

        VyTrackUtils.goToVehiclesPage();

    }


    @Given("TruckDriver_GridBtn_third is on the vehicle page")
    public void truck_driver_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver_username3", "password");

        VyTrackUtils.goToVehiclesPage();

    }


    @Given("StoreManager_GridBtn_first is on the vehicle page")
    public void store_manager_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager_username1", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("StoreManager_GridBtn_second is on the vehicle page")
    public void store_manager_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager_username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("StoreManager_GridBtn_third is on the vehicle page")
    public void store_manager_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager_username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_first is on the vehicle page")
    public void sales_manager_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager_username1", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_second is on the vehicle page")
    public void sales_manager_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager_username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_third is on the vehicle page")
    public void sales_manager_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager_username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }

}
