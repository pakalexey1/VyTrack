package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResetButton_StepDef extends BasePage {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("user  {string} {string} is on the vehicle page")
    public void user_is_on_the_vehicle_page(String username, String password) {
        VyTrackUtils.login(username, password);
        VyTrackUtils.goToVehiclesPage();
    }

    @When("user click Reset button")
    public void userClickResetButton() {

        getWait10().until(ExpectedConditions.visibilityOf(vehiclesPage.reset_button));
        Assert.assertTrue(vehiclesPage.reset_button.isDisplayed());
        Assert.assertTrue(vehiclesPage.reset_button.isEnabled());
        vehiclesPage.reset_button.click();
    }

    @And("user go to setting and uncheck Licence plate")
    public void userGoToSettingAndUncheckLicencePlate() {
       vehiclesPage.gridSettingsButton.click();
       getWait10().until(ExpectedConditions.visibilityOf(vehiclesPage.licensePlate));
        getWait10().until(ExpectedConditions.elementToBeSelected(vehiclesPage.licensePlate));
       Assert.assertTrue(vehiclesPage.licensePlate.isSelected());

       vehiclesPage.licensePlate.click();
       Assert.assertTrue(vehiclesPage.licensePlate.isEnabled());
       vehiclesPage.closeSettingsDropdown.click();
    }

    @Then("user click Reset button and verify that Licence plate is checked")
    public void userClickResetButtonAndVerifyThatLicencePlateIsChecked() {

        getWait10().until(ExpectedConditions.elementToBeClickable(vehiclesPage.reset_button));
        vehiclesPage.reset_button.click();
        vehiclesPage.gridSettingsButton.click();
        getWait10().until(ExpectedConditions.visibilityOf(vehiclesPage.licensePlate));
        Assert.assertTrue(vehiclesPage.licensePlate.isSelected());
    }

}
