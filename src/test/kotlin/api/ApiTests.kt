package api

import com.codeborne.selenide.logevents.SelenideLogger.step
import java.security.MessageDigest
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class ApiTests {

    @Test
    fun firstApiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("API TEST #1")
        }
    }

    @Test
    fun secondApiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("API TEST #2")
        }
    }
}