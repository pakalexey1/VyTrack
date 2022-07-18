package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExportGridDropdown_StepDefinitions extends BasePage{

    VehiclesPage vehiclesPage = new VehiclesPage();
    BasePage basePage = new BasePage();

    @Given("^user \"([^\"]*)\" \"([^\"]*)\" is on the vehicle page$")
    public void user_is_on_the_vehicle_page(String arg1, String arg2) {
        VyTrackUtils.login(arg1, arg2);
        VyTrackUtils.goToVehiclesPage();
    }

    @When("^user clicks on Export Grid dropdown button$")
    public void user_clicks_on_export_grid_dropdown_button() {

        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdownButton));
        vehiclesPage.exportGridDropdownButton.click();
    }

    @Then("^user should see two options: CSV and XLSX$")
    public void user_should_see_two_options_csv_and_xlsx() {

        Assert.assertTrue(vehiclesPage.csvButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.xlsxButton.isDisplayed());
        basePage.logout();
    }

    /**
     * Ganjina's Stuff:
     */

    @Given("user {string} {string} is on the All cars page")
    public void userIsOnTheAllCarsPage(String username, String password) {
        VyTrackUtils.login(username, password);
        VyTrackUtils.goToVehiclesPage();
    }

    @When("user moves to Export Grid Dropdown button")
    public void user_moves_to_export_grid_dropdown_button() {
        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdownButton));
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

        Assert.assertTrue("Test failed", ((xPos + width) <= winWidth / 2) && (yPos + height) <= winHeight / 2);

        basePage.logout();
    }
}



