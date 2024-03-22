import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.WebDriverRunner
import com.codeborne.selenide.conditions.Editable
import com.codeborne.selenide.conditions.Focused
import com.codeborne.selenide.conditions.Interactable
import com.codeborne.selenide.conditions.Visible
import com.codeborne.selenide.logevents.SelenideLogger
import com.codeborne.selenide.logevents.SelenideLogger.step
import io.qameta.allure.Issue
import io.qameta.allure.selenide.AllureSelenide
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.openqa.selenium.Dimension
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver
import java.io.IOException
import java.net.URL

class IssueTest {

    @BeforeEach
    @Throws(IOException::class)
    fun initDriver() {
        SelenideLogger.addListener("Allure listener", AllureSelenide())
        val firefoxOptions = FirefoxOptions()
        firefoxOptions.setBinary("resources/drivers/geckodriver")
        WebDriverRunner.setWebDriver(FirefoxDriver(firefoxOptions))

//        val url = "http://192.168.90.245:4444/wd/hub"
//        val chromeOptions = ChromeOptions()
//        val driver: WebDriver = RemoteWebDriver(URL(url), chromeOptions)
//        driver.manage().window().size = Dimension(1920, 1024)
//        WebDriverRunner.setWebDriver(driver)
    }

    @Test
    @Issue("AE-2")
    @DisplayName("Открываем сщуствующую Issue")
    fun testIssue() {

        step("Открываем главную страницу") {
            open("https://www.wildberries.ru/")
            WebDriverRunner.driver().webDriver.manage().window().maximize()
            sleep(1_000L)
        }
        step("Вводим товар в поиск") {
            `$`("#searchInput")
                .shouldBe(Editable())
                .sendKeys("onyx boox note air 3", Keys.ENTER)
        }
        step("Проверяем, что товар найден") {
            `$`(byText("товаров найдено")).should(Visible())
        }
        println()
    }

    @AfterEach
    fun stopDriver() {
        WebDriverRunner.getWebDriver().quit()
    }

}