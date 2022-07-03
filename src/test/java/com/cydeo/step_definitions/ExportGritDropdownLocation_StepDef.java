package com.cydeo.step_definitions;

import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class ExportGritDropdownLocation_StepDef {

    VehiclesPage vehiclesPage = new VehiclesPage();
    Actions actions;

    @Given("truck_driver_one is on the All cars page")
    public void truck_driver_one_is_on_the_all_cars_page() {
        VyTrackUtils.login("truck_driver.username1","password");
        VyTrackUtils.goToVehiclesPage();

    }
    @When("user moves to Export Grid Dropdown button")
    public void user_moves_to_export_grid_dropdown_button() {
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesPage.exportGridDropdownButton).perform();
    }
    @Then("user sees the Export Grid Dropdown button on the left side of the page")
    public void user_sees_the_export_grid_dropdown_button_on_the_left_side_of_the_page() {
        Point location = vehiclesPage.exportGridDropdownButton.getLocation();
        int winHeight = Driver.getDriver().manage().window().getSize().getHeight();
        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
        int xPos = location.getX();
        int yPos = location.getY();
        int height = vehiclesPage.exportGridDropdownButton.getSize().getHeight();
        int width = vehiclesPage.exportGridDropdownButton.getSize().getWidth();

        Assert.assertTrue("Test failed",((xPos+width) <= winWidth/2) && (yPos + height) <= winHeight/2);



    }

    @Given("truck_driver_two is on the All cars page")
    public void truck_driver_twoIsOnTheAllCarsPage() {
        VyTrackUtils.login("truck_driver.username2","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("truck_driver_three is on the All cars page")
    public void truck_driver_threeIsOnTheAllCarsPage() {
        VyTrackUtils.login("truck_driver.username3","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("store_manager_one is on the All cars page")
    public void store_manager_oneIsOnTheAllCarsPage() {
        VyTrackUtils.login("store_manager.username1","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("store_manager_two is on the All cars page")
    public void store_manager_twoIsOnTheAllCarsPage() {
        VyTrackUtils.login("store_manager.username2","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("store_manager_three is on the All cars page")
    public void store_manager_threeIsOnTheAllCarsPage() {
        VyTrackUtils.login("store_manager.username3","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("sales_manager_one is on the All cars page")
    public void sales_manager_oneIsOnTheAllCarsPage() {
        VyTrackUtils.login("sales_manager.username1","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("sales_manager_two is on the All cars page")
    public void sales_manager_twoIsOnTheAllCarsPage() {
        VyTrackUtils.login("sales_manager.username2","password");
        VyTrackUtils.goToVehiclesPage();

    }

    @Given("sales_manager_three is on the All cars page")
    public void sales_manager_threeIsOnTheAllCarsPage() {
        VyTrackUtils.login("sales_manager.username3","password");
        VyTrackUtils.goToVehiclesPage();

    }
}
