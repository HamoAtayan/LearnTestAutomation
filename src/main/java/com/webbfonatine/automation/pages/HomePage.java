package com.webbfonatine.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class HomePage extends BasePage {
    @FindBy(css = "a[href='/formx/formX/create?typeOfFormX=IM']")
    private WebElement fillFormM;

    @FindBy(css = "a[href='/formx/formX/list']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickFillFOrmm() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForElementToBeClickable(driver, fillFormM);
        fillFormM.click();
    }

    public void clickSearchBtn(){
        com.webbfontaine.automation.helpers.WaitHelper.waitForElementToBeClickable(driver,searchButton);
        searchButton.click();
    }

}
