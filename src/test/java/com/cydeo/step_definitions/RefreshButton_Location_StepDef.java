package com.cydeo.step_definitions;

import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshButton_Location_StepDef {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    Actions actions;
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("{string} {string}  is on the vehicle page")
    public void isOnTheVehiclePage(String username, String password) {

        VyTrackUtils.login(username, password);
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

        Assert.assertTrue(vehiclesPage.ifButtonOnTheLeft("Refresh", "Reset"));

        vehiclesPage.logout();
    }


}
