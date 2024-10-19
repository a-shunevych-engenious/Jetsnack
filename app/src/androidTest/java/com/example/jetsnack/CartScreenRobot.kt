package com.example.jetsnack

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasScrollAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollToNode

fun <R> cardScreen(block: CardScreenRobot.() -> R) = CardScreenRobot().run(block)

@OptIn(ExperimentalTestApi::class)
class CardScreenRobot {
    private val composeRule = BaseTest.composeTestRule
    private val cardContentBox = hasTestTag("CartContentBox")
    private val scrollNodeAction = composeRule.onNode(hasScrollAction())
    private val cupcakeMatcher = hasText("Cupcake")
    private val cupcake = composeRule.onNodeWithText("Cupcake", ignoreCase = true)
    private val snackDetailNode = hasTestTag("SnackDetail")

    fun verifyCartScreen() {
        if (!composeRule.onNode(cardContentBox).isDisplayed()){
            mainScreen { clickOnMyCart() }
            composeRule.waitUntilExactlyOneExists(
                cardContentBox
            )
        }
    }

    fun navigateToCupcake(){
        if (!cupcake.isDisplayed()) {
            scrollNodeAction.performScrollToNode(
                matcher = cupcakeMatcher
            )
        }
        cupcake.performClick()
        composeRule.waitUntilExactlyOneExists(
            matcher = snackDetailNode,
            timeoutMillis = 10_000
        )
    }
}