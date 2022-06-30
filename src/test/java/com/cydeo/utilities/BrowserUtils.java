package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BrowserUtils {
    public static void switchWindowAndVerify( String expectedInUrl, String expectedTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles){
            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl.toLowerCase())){
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title verification failed",actualTitle.contains(expectedTitle));
    }
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Title verification failed");
    }

    public static void waitForInvisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}

/*
TC : Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Multiple Windows logic re-usable
3. When method is called, it should switch window and verify
title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl (part of URL that will be checked if the actual URL contains it)
• Arg3: String expectedTitle (part of the Title that will be checked if the actual title contains it)
 */