package ui

import com.codeborne.selenide.logevents.SelenideLogger.step
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class UiTests {

    @Test
    fun firstUiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("UI TEST #1")
        }
    }

    @Test
    fun secondUiTest() {
        step("[STEP #1]") {
            sleep(5_000L)
            println("UI TEST #2")
        }
    }
}