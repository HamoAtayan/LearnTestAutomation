package com.webbfonatine.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.webbfontaine.automation.helpers.WaitHelper.waitForElementToBeClickable;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class CreateFormMPage extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(id = "xmlFile")
    private WebElement uploadXML;

    @FindBy(id = "operationSubmit")
    private WebElement submitOperation;

    @FindBy(xpath = "//div[@class='wf-alert-scrolable alert alert-block alert-info']")
    private WebElement operationMessage;

    @FindBy(id = "xmlImportButton")
    private WebElement importXMLbtn;

    @FindBy(id = "startUpload")
    private WebElement ImportFromXml;

    @FindBy(id = "confirmOper")
    private WebElement confimOperation;

    @FindBy(id = "verify")
    WebElement verifyBtn;

    @FindBy(id = "operationStore")
    WebElement storeBtn;

    @FindBy(id = "operationreAccept")
    WebElement reSubmitBtn;

    @FindBy(id = "applicationNumberContainer")
    private WebElement applicationNumber;

    @FindBy(xpath = "//h3[text()='CBN Form - Fill Form M']")
    private WebElement CBNFillFormText;

    @FindBy(css = ".alert-error.wf-error-bold.errorMes")
    private WebElement errorText;

    @FindBy(id = "operationsubmitStored")
    private WebElement operationsubmitStored;

    @FindBy(css = "a[href='#attachments']")
    private WebElement attachmentsTab;

    @FindBy(css = "div[class='wf-alert-scrolable alert alert-block alert-info']")
    private WebElement storeSuccessMessage;

    public CreateFormMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='#parties']")
    private WebElement namesAndParties;

    public void scrollUp() {
        js.executeScript("window.scrollBy(0,-1000)");
    }

    public String getFormmId() {
        return driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('/'));
    }

    public void scrollDown() {
        js.executeScript("window.scrollBy(0,1200)");
    }


    public void clickVerifyBtn() {
        waitForElementToBeClickable(driver, verifyBtn);
        verifyBtn.click();
    }

    public void clickReSubmitBtn() {
        reSubmitBtn.click();
    }

    public void clickStoreBtn() {
        storeBtn.click();
    }

    public void clickConfirmOperationYesBtn() {
        waitForElementToBeClickable(this.driver, confimOperation);
        confimOperation.click();
    }

    public String getOperationMessageText() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(this.driver, operationMessage);
        return operationMessage.getText();
    }

    public void clickAttachmentsTab() {
        waitForElementToBeClickable(driver, attachmentsTab);
        attachmentsTab.click();
    }

    public void clickNamesAndPArties() {
        namesAndParties.click();
    }

    public String getStoreSuccessMessage() {
        com.webbfontaine.automation.helpers.WaitHelper.waitForVisibilityOfElement(driver, storeSuccessMessage);
        return storeSuccessMessage.getText();
    }
}
