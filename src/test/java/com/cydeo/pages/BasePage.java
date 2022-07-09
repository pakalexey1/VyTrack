package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement logout_dropdown;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout_button;

    @FindBy(xpath = "//i[@class='fa-asterisk menu-icon']/parent::span[@class='title title-level-1']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    public void logout() {

        BrowserUtils.getWait10().until(ExpectedConditions.visibilityOf(logout_dropdown));
        logout_dropdown.click();

        BrowserUtils.getWait10().until(ExpectedConditions.visibilityOf(logout_button));
        logout_button.click();
    }
}