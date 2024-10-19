package com.example.jetsnack

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick

fun <R> mainScreen(block: MainScreenRobot.() -> R) = MainScreenRobot().run(block)

@OptIn(ExperimentalTestApi::class)
class MainScreenRobot {
    private val composeRule = BaseTest.composeTestRule // getting rule instance
    private val myCartTabButton = composeRule.onNodeWithText("MY CART")

    fun verifyMainScreenLoaded() {
        composeRule.waitUntilExactlyOneExists(
            matcher = hasText("HOME"),
            timeoutMillis = 10_000
        )
    }

    fun clickOnMyCart() {
        // Navigate to Cart
        myCartTabButton.assertExists()
        myCartTabButton.assertIsDisplayed()
        myCartTabButton.performClick()
    }
}