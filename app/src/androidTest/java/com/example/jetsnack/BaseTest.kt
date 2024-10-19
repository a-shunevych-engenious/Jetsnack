package com.example.jetsnack

import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.jetsnack.ui.MainActivity
import org.junit.Rule
import org.junit.rules.RuleChain

open class BaseTest  {
    companion object {
        lateinit var composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>
    }

    // Whenever we start test it will init compose rule instance, so we can use it later in our robots
    init {
        composeTestRule = createAndroidComposeRule<MainActivity>()
    }

    @get:Rule
    val ruleChain: RuleChain = run {
        RuleChain.outerRule(composeTestRule)
    }
}