package com.webbfonatine.automation.pages.tabs;

import com.webbfonatine.automation.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class FinancialTab extends BasePage {

    @FindBy(css = "a[href='#financial']")
    private WebElement financialBtn;

    @FindBy(id = "sourceOfFundsCode")
    private WebElement sourceOfFunds;

    @FindBy(id = "currencyCode")
    private WebElement currencyCode;

    @FindBy(id = "currencyExchangeRate")
    private WebElement exchangeRate;

    @FindBy(id = "totalFreightCharges")
    private WebElement totalFreightCharges;

    @FindBy(id = "totalAncillaryCharges")
    private WebElement totalAncillaryCharges;

    @FindBy(id = "insuranceCosts")
    private WebElement insuranceValue;

    @FindBy(id = "proformaInvoiceNumber")
    private WebElement proformaInvoiceNumber;

    @FindBy(id = "proformaInvoiceDate")
    private WebElement proformaInvoiceDate;

    @FindBy(id = "modeOfPaymentCode")
    private WebElement modeOfPayment;

    @FindBy(id = "paymentDate")
    private WebElement paymentDate;

    @FindBy(id = "modeOfTransferCode")
    private WebElement modeOfTransfer;

    @FindBy(id = "termsOfDeliveryCode")
    private WebElement termsOfDelivery;

    public FinancialTab(WebDriver driver) {
        super(driver);
    }

    public void setSourceOfFunds(String sourceOfFunds) {
        this.sourceOfFunds.sendKeys(sourceOfFunds);
        this.sourceOfFunds.sendKeys(Keys.TAB);
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode.sendKeys(currencyCode);
        this.currencyCode.sendKeys(Keys.TAB);
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate.sendKeys(exchangeRate);
    }

    public void setTotalFreightCharges(String totalFreightCharges) {
        this.totalFreightCharges.sendKeys(totalFreightCharges);
    }

    public void setTotalAncillaryCharges(String totalAncillaryCharges) {
        this.totalAncillaryCharges.sendKeys(totalAncillaryCharges);
    }

    public void setInsuranceValue(String insuranceValue) {
        this.insuranceValue.sendKeys(insuranceValue);
    }

    public void setProformaInvoiceNumber(String proformaInvoiceNumber) {
        this.proformaInvoiceNumber.sendKeys(proformaInvoiceNumber);
    }

    public void setProformaInvoiceDate() {
        this.proformaInvoiceDate.click();
        this.proformaInvoiceDate.sendKeys(Keys.ENTER);
    }

    public void clearProformaInvoiceDate() {
        this.proformaInvoiceDate.clear();
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment.sendKeys(modeOfPayment);
        this.modeOfPayment.sendKeys(Keys.TAB);
    }

    public void setPaymentDate() {
        this.paymentDate.click();
        this.paymentDate.sendKeys(Keys.ENTER);
    }

    public void setModeOfTransfer(String modeOfTransfer) {
        this.modeOfTransfer.sendKeys(modeOfTransfer);
        this.modeOfTransfer.sendKeys(Keys.TAB);
    }

    public void setTermsOfDelivery(String termsOfDelivery) {
        this.termsOfDelivery.sendKeys(termsOfDelivery);
        this.termsOfDelivery.sendKeys(Keys.TAB);
    }
}
