package com.cydeo.utilities;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LogoutFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class VyTrackUtils {
    public static void login (String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));
        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.submitButton.click();}
    public static void goToVehiclesPage(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.titleContains("Dashboard"));
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.fleetModule.click();
        dashboardPage.vehiclesOption.click();}
    public static void vyTrack_logout(WebDriver driver) {
        LogoutFunction logoutFunction=new LogoutFunction();
        logoutFunction.logout_dropdown.click();
        logoutFunction.logout_button.click();}}
