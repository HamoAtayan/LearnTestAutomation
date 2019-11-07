package com.webbfonatine.automation.pages.tabs;

import com.webbfonatine.automation.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class HeaderTab extends BasePage {
    @FindBy(id = "validForForex")
    WebElement validForForex;

    @FindBy(id = "prefix")
    WebElement prefix;

    @FindBy(id = "bankCode")
    WebElement bankCode;

    @FindBy(id = "bankBranchCode")
    WebElement bankBranchCode;

    @FindBy(css = ".alert.alert-block.alert-info > p")
    WebElement storeSuccessMessage;

    @FindBy(css = ".wf-alert-scrolable.alert.alert-block.alert-info > p")
    WebElement submitSuccessMessage;

    @FindBy(xpath = "//div[@class='wf-alert-scrolable alert alert-block alert-info']")
    WebElement reSubmitSuccessMessage;

    @FindBy(css = "#formContent > div.wf-alert-scrolable.alert.alert-block.alert-info")
    WebElement successMessage;

    @FindBy(css = "div.wf-alert-scrolable.alert.alert-block.alert-error.errorContainer")
    WebElement withoutGoodsErrorMessage;

    @FindBy(id = "applicantTin-error")
    WebElement applicantTinError;

    public HeaderTab(WebDriver driver) {
        super(driver);
    }

    public String getApplicantTinError() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, applicantTinError);
        return applicantTinError.getText();
    }

    public String getWithoutGoodsErrorMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, withoutGoodsErrorMessage);
        return withoutGoodsErrorMessage.getText();
    }

    public String getStoreSuccessMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, storeSuccessMessage);
        return storeSuccessMessage.getText();
    }

    public String getSubmitSuccessMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, submitSuccessMessage);
        return submitSuccessMessage.getText();
    }

    public String getReSubmitSuccessMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, reSubmitSuccessMessage);
        return reSubmitSuccessMessage.getText();
    }

    public String getSuccessMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, successMessage);
        return successMessage.getText();
    }

    public void setValidForForex(String validForForex) {
        this.validForForex.sendKeys(validForForex);
        this.validForForex.sendKeys(Keys.TAB);
    }

    public void setPrefix(String prefix) {
        this.prefix.sendKeys(prefix);
        this.prefix.sendKeys(Keys.TAB);
    }

    public void setBankCode(String bankCode) {
        this.bankCode.sendKeys(bankCode);
        this.bankCode.sendKeys(Keys.TAB);
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode.sendKeys(bankBranchCode);
        this.bankBranchCode.sendKeys(Keys.TAB);
    }

    public String getBankCode() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, bankCode);
        return bankCode.getAttribute("value");
    }
}
