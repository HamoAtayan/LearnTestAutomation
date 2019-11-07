package com.webbfontaine.automation.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class WaitHelper {
    public static final int TIMEOUT = 30;

    public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(elementToBeClickable(element));
    }

    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(visibilityOf(element));
    }


}
