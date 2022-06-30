package com.cydeo.step_definitions;

import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExportGridDropdown {

    @Given("user is on the vehicle page")
    public void user_is_on_the_vehicle_page() {
        VyTrackUtils.login("store_manager.username1","password");
        VyTrackUtils.goToVehiclesPage();
    }
    @When("user clicks on Export Grid dropdown button")
    public void user_clicks_on_export_grid_dropdown_button() {
        VehiclesPage vehiclesPage = new VehiclesPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.exportGridDropdownButton));
        vehiclesPage.exportGridDropdownButton.click();
    }
    @Then("user should see two options: CSV and XLSX")
    public void user_should_see_two_options_csv_and_xlsx() {
        VehiclesPage vehiclesPage = new VehiclesPage();

        Assert.assertTrue(vehiclesPage.csvButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.xlsxButton.isDisplayed());
    }
}
