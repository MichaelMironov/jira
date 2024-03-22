package api

import com.codeborne.selenide.logevents.SelenideLogger.step
import org.junit.jupiter.api.Test

class ApiTests {

    @Test
    fun firstApiTest() {
        step("[STEP #1]") {
            println("API TEST #1")
        }
    }

    @Test
    fun secondApiTest() {
        step("[STEP #1]") {
            println("API TEST #2")
        }
    }
}