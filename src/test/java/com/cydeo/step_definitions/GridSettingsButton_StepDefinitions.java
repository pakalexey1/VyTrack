package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSettingsButton_StepDefinitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    BasePage basePage = new BasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    @Given("TruckDriver_GridBtn_first is on the vehicle page")
    public void truck_driver_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver.username1", "password");
        VyTrackUtils.goToVehiclesPage();
    }

    @Given("user can see Grid Settings button and click")
    public void user_can_see_grid_settings_button_and_click() {

        Assert.assertTrue(vehiclesPage.gridSettingsButton.isDisplayed());
   wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.gridSettingsButton));
        vehiclesPage.gridSettingsButton.click();
        Assert.assertTrue(vehiclesPage.gridSettingsDropdown.isDisplayed());

        basePage.logout();
    }


    @Given("TruckDriver_GridBtn_second is on the vehicle page")
    public void truck_driver_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver.username2", "password");

        VyTrackUtils.goToVehiclesPage();

    }


    @Given("TruckDriver_GridBtn_third is on the vehicle page")
    public void truck_driver_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("truck_driver.username3", "password");

        VyTrackUtils.goToVehiclesPage();

    }


    @Given("StoreManager_GridBtn_first is on the vehicle page")
    public void store_manager_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager.username1", "password");

        VyTrackUtils.goToVehiclesPage();

    }


    @Given("StoreManager_GridBtn_second is on the vehicle page")
    public void store_manager_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager.username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("StoreManager_GridBtn_third is on the vehicle page")
    public void store_manager_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager.username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_first is on the vehicle page")
    public void sales_manager_grid_btn_first_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager.username1", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_second is on the vehicle page")
    public void sales_manager_grid_btn_second_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager.username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }


    @Given("SalesManager_GridBtn_third is on the vehicle page")
    public void sales_manager_grid_btn_third_is_on_the_vehicle_page() {
        VyTrackUtils.login("sales_manager.username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }

}
