package com.cydeo.pages;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VehiclesPage {
    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[contains(@title,'export')]")
    public WebElement exportGridDropdownButton;
    @FindBy(css = "a[title='CSV']")
    public WebElement csvButton;
    @FindBy(css="a[title='XLSX']")
    public WebElement xlsxButton;
    @FindBy(css="a[title='Grid Settings']")
    public WebElement grid_settings;
    @FindBy(css="a[title='Refresh']")
    public WebElement refresh_button;
    @FindBy(css="a[title='Reset']")
    public WebElement reset_button;}
