package com.example.jetsnack

import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.printToLog
import org.junit.Test

class EngeniousDemoTests: BaseTest() {

    // Demo tests
    @Test
    fun select_inspired_product_0() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }

    // Demo tests
    @Test
    fun select_inspired_product_1() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }

    // Demo tests
    @Test
    fun select_inspired_product_2() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }

    // Demo tests
    @Test
    fun select_inspired_product_3() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }

    // Demo tests
    @Test
    fun select_inspired_product_4() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }

    // Demo tests
    @Test
    fun select_inspired_product_5() {
        mainScreen {
            verifyMainScreenLoaded()
            clickOnMyCart()
        }
        // Semantics tree concept!
        composeTestRule.onNode(isRoot(), useUnmergedTree = false).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Merged Tree"
        )
        composeTestRule.onNode(isRoot(), useUnmergedTree = true).printToLog(
            tag = "${EngeniousDemoTests::class.java.name} using Unmerged Tree"
        )

        cardScreen{
            verifyCartScreen()
            navigateToCupcake()
        }
    }
}