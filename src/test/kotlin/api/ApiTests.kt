package api

import com.codeborne.selenide.logevents.SelenideLogger.step
import io.qameta.allure.Issue
import java.security.MessageDigest
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class ApiTests {

    @Test
    @Issue("CRC-1")
    fun firstApiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("API TEST #1")
        }
    }

    @Test
    @Issue("CRC-1")
    fun secondApiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("API TEST #2")
        }
    }
}