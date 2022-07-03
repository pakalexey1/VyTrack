package com.cydeo.step_definitions;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;
public class ClickRefreshButton_3 {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @When("^user clicks on the Refresh button$")
    public void user_clicks_on_the_refresh_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Refresh']")));
        VehiclesPage vehiclesPage = new VehiclesPage();
        Assert.assertTrue(vehiclesPage.reset_button.isDisplayed());
        Assert.assertTrue(vehiclesPage.reset_button.isEnabled());}

    @Then("^user see page is refreshed$")
    public void user_see_page_is_refreshed() {
        VehiclesPage vehiclesPage = new VehiclesPage();
        boolean clicked = false;
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refresh_button));
        try {vehiclesPage.refresh_button.click();
            clicked = true;
        } catch (Exception e) {
            throw new NoSuchElementException();}
        Assert.assertTrue(clicked);

        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");}};
        try {wait.until(expectation);
        } catch (Throwable error) {
            Assert.assertFalse("Timeout waiting for Page Load", true);}
        VyTrackUtils.vyTrack_logout(Driver.getDriver());}}

/*

}
@When("user clicks on the Refresh button")
public void user_clicks_on_the_refresh_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user see page is refreshed")
public void user_see_page_is_refreshed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


 */


