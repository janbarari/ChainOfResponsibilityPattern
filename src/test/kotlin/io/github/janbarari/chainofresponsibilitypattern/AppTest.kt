package io.github.janbarari.chainofresponsibilitypattern

import io.github.janbarari.chainofresposibilitypattern.App
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun shouldExecuteApplicationWithoutException() {
        Assertions.assertDoesNotThrow { App.main() }
    }

}