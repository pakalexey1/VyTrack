package com.cydeo.pages;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='fa-asterisk menu-icon']/parent::span[@class='title title-level-1']")
    public WebElement fleetModule;
    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;}
