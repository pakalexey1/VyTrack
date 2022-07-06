package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

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
        wait.until(ExpectedConditions.visibilityOf(logout_dropdown));
        logout_button.click();

        wait.until(ExpectedConditions.visibilityOf(logout_button));
        logout_button.click();
    }
}