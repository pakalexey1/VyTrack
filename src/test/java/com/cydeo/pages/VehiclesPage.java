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

    @FindBy(xpath = "//a[contains(@title,'export')]")
    public WebElement exportGridDropdownButton;

    @FindBy(css = "a[title='CSV']")
    public WebElement csvButton;

    @FindBy(css = "a[title='XLSX']")
    public WebElement xlsxButton;
    @FindBy(css = "a[title='Refresh']")
    public WebElement refresh_button;
    @FindBy(css = "a[title='Reset']")
    public WebElement reset_button;
    @FindBy(className = "oro-subtitle")
    public WebElement allCarsDropDownButton;

    @FindBy(css = "a[data-value=\"__all__\"]")
    public WebElement allCarsOption;

    @FindBy(css = "a[title=\"Refresh\"]")
    public WebElement refreshButton;

    @FindBy(css = "div[class='column-manager dropdown']")
    public WebElement gridSettingsButton;

    @FindBy(css = "div[class='column-manager dropdown open']")
    public WebElement gridSettingsDropdown;

    @FindBy(css = "button[data-toggle=\"dropdown\"]")
    public WebElement viewPerPageDropdown;

    @FindBy(xpath = "//div[@class='btn-group']//a[contains(text(),\"50\")]")
    public WebElement viewPerPage50Option;

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
