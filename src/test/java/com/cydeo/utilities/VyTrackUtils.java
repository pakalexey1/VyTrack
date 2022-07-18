package com.cydeo.utilities;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrackUtils extends BasePage {

    public static void login(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.submitButton.click();
    }
    public static void  goToVehiclesPage() {

        BasePage basePage = new BasePage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        Actions actions = new Actions(Driver.getDriver());

        wait.until(ExpectedConditions.titleContains("Dashboard"));
        wait.until(ExpectedConditions.visibilityOf(basePage.fleetModule));

        actions.moveToElement(basePage.fleetModule).pause(1000).perform();

        basePage.fleetModule.click();
        basePage.vehiclesOption.click();
    }
}











