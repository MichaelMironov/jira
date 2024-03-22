package ui

import com.codeborne.selenide.logevents.SelenideLogger.step
import org.junit.jupiter.api.Test

class UiTests {
    @Test
    fun firstUiTest() {
        step("[STEP #1]") {
            println("UI TEST #1")
        }
    }

    @Test
    fun secondUiTest() {
        step("[STEP #1]") {
            println("UI TEST #2")
        }
    }
}