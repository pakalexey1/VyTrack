package com.cydeo.pages;

import com.cydeo.utilities.BaseModel;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends BaseModel{

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);   }

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement logout_dropdown;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout_button;

    @FindBy(xpath = "//i[@class='fa-asterisk menu-icon']/parent::span[@class='title title-level-1']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement loaderMask;

    public void logout() {

        getWait10().until(ExpectedConditions.visibilityOf(logout_dropdown));
        logout_dropdown.click();

        getWait10().until(ExpectedConditions.visibilityOf(logout_button));
        logout_button.click();
    }
}