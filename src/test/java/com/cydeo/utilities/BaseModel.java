package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel {
    private WebDriverWait wait;
    private Actions actions;

    protected WebDriverWait getWait10() {
        if (wait == null) {
            wait = new WebDriverWait(Driver.getDriver(), 10);
        }
        return wait;
    }

    protected Actions getActions() {
        if(actions == null) {
            actions = new Actions(Driver.getDriver());
        }
        return actions;
    }

    public BaseModel() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
