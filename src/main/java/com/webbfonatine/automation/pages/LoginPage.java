package com.webbfontaine.automation.pages;

import com.webbfonatine.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class LoginPage extends BasePage {

    @FindBy(css = "input[name='josso_username']")
    private WebElement username;

    @FindBy(css = "input[name='josso_password']")
    private WebElement password;

    @FindBy(css = ".button")
    private WebElement loginBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setUsername(String username) {
        this.username.sendKeys(username);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

}
