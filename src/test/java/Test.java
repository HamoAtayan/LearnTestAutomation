import com.webbfonatine.automation.pages.CreateFormMPage;
import com.webbfonatine.automation.pages.HomePage;
import com.webbfonatine.automation.pages.LoginPage;
import com.webbfonatine.automation.pages.tabs.HeaderTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Test {
    WebDriver driver;

    @BeforeClass
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("http://ngqa.webbfontaine.am:8086/formx");
    }

    @org.testng.annotations.Test
    public void checkPOM() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        HeaderTab headerTab = new HeaderTab(driver);
        CreateFormMPage createFormMPage = new CreateFormMPage(driver);

        loginPage.setUsername("WF-hatayan");
        loginPage.setPassword("123456");
        loginPage.clickLoginBtn();

        homePage.clickFillFOrmm();
        headerTab.setValidForForex("yes");
        headerTab.setPrefix("BA");
        headerTab.setBankCode("014");
        headerTab.setBankBranchCode("00014");

        createFormMPage.clickNamesAndPArties();
        createFormMPage.clickStoreBtn();

        Assert.assertEquals(createFormMPage.getStoreSuccessMessage(), "×\n" +
                "Form M has been stored.");
    }

    @AfterMethod
    public void postCondtion() {
        driver.close();
    }
}
