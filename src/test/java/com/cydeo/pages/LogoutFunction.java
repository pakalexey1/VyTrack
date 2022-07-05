package com.cydeo.pages;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LogoutFunction {
    public LogoutFunction(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement logout_dropdown;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout_button;}
// added logout