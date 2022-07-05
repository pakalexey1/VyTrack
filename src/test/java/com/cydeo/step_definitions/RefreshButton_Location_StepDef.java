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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class RefreshButton_Location_StepDef {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    Actions actions;

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("Truck_Driver_one is on the vehicle page")
    public void truck_driver_one_is_on_the_vehicle_page() throws InterruptedException {
        VyTrackUtils.login("truck_driver.username1", "password");
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
        Point refresh = vehiclesPage.refreshButton.getLocation();
        int winHeight = Driver.getDriver().manage().window().getSize().getHeight();
        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();


        int xPos = refresh.getX();
        int yPos = refresh.getY();
        int height = vehiclesPage.refreshButton.getSize().getHeight();
        int width = vehiclesPage.refreshButton.getSize().getWidth();


        Point reset = vehiclesPage.resetButton.getLocation();
        int x1Pos = reset.getX();
        int y1Pos = reset.getY();

        Assert.assertTrue("Test failed", ((xPos + width) >= winWidth / 2) && (yPos + height) <= winHeight / 2);
        Assert.assertTrue("Test failed", xPos < x1Pos && yPos == y1Pos);

        vehiclesPage.logout();
    }

    @Given("Truck_Driver_two is on the vehicle page")
    public void truck_driver_twoIsOnTheVehiclePage() {
        VyTrackUtils.login("truck_driver.username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Truck_Driver_three is on the vehicle page")
    public void truck_driver_threeIsOnTheVehiclePage() {
        VyTrackUtils.login("truck_driver.username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Store_Manager_one is on the vehicle page")
    public void store_manager_oneIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username1", "password");

        VyTrackUtils.goToVehiclesPage();

    }

    @Given("Store_Manager_two is on the vehicle page")
    public void store_manager_twoIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Store_Manager_three is on the vehicle page")
    public void store_manager_threeIsOnTheVehiclePage() {
        VyTrackUtils.login("store_manager.username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_one is on the vehicle page")
    public void sales_manager_oneIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username1", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_two is on the vehicle page")
    public void sales_manager_twoIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username2", "password");

        VyTrackUtils.goToVehiclesPage();
    }

    @Given("Sales_Manager_three is on the vehicle page")
    public void sales_manager_threeIsOnTheVehiclePage() {
        VyTrackUtils.login("sales_manager.username3", "password");

        VyTrackUtils.goToVehiclesPage();
    }
}
