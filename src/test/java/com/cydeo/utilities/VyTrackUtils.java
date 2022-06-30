package com.cydeo.utilities;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrackUtils {

    public static void login (String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.submitButton.click();
    }

    public static void goToVehiclesPage(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.titleContains("Dashboard"));
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.fleetModule.click();
        dashboardPage.vehiclesOption.click();

    }
}
