package com.cydeo.utilities;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;

public class VyTrackUtils {

    public static void login (String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.submitButton.click();
    }

    public static void goToVehiclesPage(){
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.fleetModule.click();
        dashboardPage.vehiclesOption.click();

    }
}
