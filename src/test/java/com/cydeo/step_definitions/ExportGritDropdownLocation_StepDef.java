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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExportGritDropdownLocation_StepDef {

    VehiclesPage vehiclesPage = new VehiclesPage();
    Actions actions;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);

    @Given("user {string} {string} is on the All cars page")
    public void userIsOnTheAllCarsPage(String username, String password) {
        VyTrackUtils.login(username, password);
        VyTrackUtils.goToVehiclesPage();

    }
    @When("user moves to Export Grid Dropdown button")
    public void user_moves_to_export_grid_dropdown_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdownButton));
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesPage.exportGridDropdownButton).pause(3000).perform();
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

        vehiclesPage.logout();

    }


}
