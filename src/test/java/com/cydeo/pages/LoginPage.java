package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "prependedInput")
    public WebElement usernameBox;

    @FindBy (id="prependedInput2")
    public WebElement passwordBox;

    @FindBy (id = "_submit")
    public WebElement submitButton;

    @FindBy(css = "a[class='no-hash']")
    public WebElement logoutButton;

    @FindBy(css = "li[id='user-menu']>a[class='dropdown-toggle']")
    public WebElement userMenuButton;


    public void loginWithCredentials(String username, String password){

        this.usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        this.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        this.submitButton.click();
    }

    public void logout(){
        this.userMenuButton.click();
        this.logoutButton.click();
    }
}
