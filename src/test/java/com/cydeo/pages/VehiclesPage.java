package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclesPage {
    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy(xpath = "//a[contains(@title,'export')]")
    public WebElement exportGridDropdownButton;

    @FindBy(css = "a[title='CSV']")
    public WebElement csvButton;

    @FindBy(css="a[title='XLSX']")
    public WebElement xlsxButton;
    @FindBy(css = "li[id='user-menu']>a[class='dropdown-toggle']")
    public WebElement userMenuButton;

    @FindBy(css = "li[class='last']>a[class='no-hash']")
    public WebElement logoutButton;
    public void logout(){
        wait.until(ExpectedConditions.visibilityOf(this.userMenuButton));
        this.userMenuButton.click();

        wait.until(ExpectedConditions.visibilityOf(this.logoutButton));
        this.logoutButton.click();
    }
}
