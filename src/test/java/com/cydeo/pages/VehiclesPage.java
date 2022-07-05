package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(css = "a[title='XLSX']")
    public WebElement xlsxButton;
    @FindBy(css="a[title='Grid Settings']")
    public WebElement grid_settings;
    @FindBy(css="a[title='Refresh']")
    public WebElement refresh_button;
    @FindBy(css="a[title='Reset']")
    public WebElement reset_button;
//added to VehiclesPage
    @FindBy(css = "li[id='user-menu']>a[class='dropdown-toggle']")
    public WebElement userMenuButton;

    @FindBy(css = "li[class='last']>a[class='no-hash']")
    public WebElement logoutButton;

    @FindBy(className = "oro-subtitle")
    public WebElement allCarsDropDownButton;

    @FindBy(css = "a[data-value=\"__all__\"]")
    public WebElement allCarsOption;

    @FindBy(css = "a[title=\"Refresh\"]")
    public WebElement refreshButton;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetButton;

    public void logout() {
        wait.until(ExpectedConditions.visibilityOf(this.userMenuButton));
        this.userMenuButton.click();

        wait.until(ExpectedConditions.visibilityOf(this.logoutButton));
        this.logoutButton.click();
    }
    @FindBy(css = "div[class='column-manager dropdown']")
    public WebElement gridSettingsButton;

    @FindBy(css = "div[class='column-manager dropdown open']")
    public WebElement gridSettingsDropdown;

    public boolean ifButtonOnTheLeft(String buttonOne, String buttonTwo) {
        boolean check = false;
        String xpath = "//a[@title='" + buttonOne + "']/..//preceding-sibling::a[@title='" + buttonTwo + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        if (element.isDisplayed()) {
            check = true;
        }
        return check;
    }
}
