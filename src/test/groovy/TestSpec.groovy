import com.webbfonatine.automation.pages.CreateFormMPage
import com.webbfonatine.automation.pages.HomePage
import com.webbfonatine.automation.pages.tabs.HeaderTab
import com.webbfonatine.automation.pages.LoginPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Zori Sargsyan on Nov, 2019
 */
class TestSpec extends Specification {

    @Shared
    WebDriver driver

    def setupSpec() {
        ChromeOptions options = new ChromeOptions()
        options.addArguments("--start-maximized")
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver")
        driver = new ChromeDriver(options)
        driver.get("http://ngqa.webbfontaine.am:8086/formx")
    }

    def 'basic test'() {
        when: 'Creaating page objects'
        LoginPage loginPage = new LoginPage(driver)
        HomePage homePage = new HomePage(driver)
        HeaderTab headerTab = new HeaderTab(driver)
        CreateFormMPage createFormMPage = new CreateFormMPage(driver)

        and: 'Login to the app'
        loginPage.setUsername("WF-hatayan")
        loginPage.setPassword("123456")
        loginPage.clickLoginBtn()

        and: 'Click on Fill FOrimm button'
        homePage.clickFillFOrmm()

        and: 'Fill necessary fields'
        headerTab.setValidForForex("yes")
        headerTab.setPrefix("BA")
        headerTab.setBankCode("014")
        headerTab.setBankBranchCode("00014")

        and: 'Click on Names And Parties'
        createFormMPage.clickNamesAndPArties()

        and: 'Click on Store button'
        createFormMPage.clickStoreBtn()

        then: 'Form M has been stored message displays'
        createFormMPage.getStoreSuccessMessage() ==  "×\nForm M has been stored."
    }

    def cleanupSpec() {
        driver.close()
    }
}
