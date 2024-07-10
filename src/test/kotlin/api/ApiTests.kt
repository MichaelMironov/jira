package api

import com.codeborne.selenide.logevents.SelenideLogger.step
import io.qameta.allure.Issue
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class ApiTests {

    @Test
    @Issue("AVTO-3")
    fun firstApiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("API TEST #1")
        }
    }

}