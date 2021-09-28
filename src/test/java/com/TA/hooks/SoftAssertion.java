package com.TA.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.assertj.core.api.SoftAssertions;

public class SoftAssertion {
    public static SoftAssertions softAssertions;

    @Before(order = 2)
    public void softAssertionHook() {
        softAssertions = new SoftAssertions();
    }

    @After()
    public void softAssertionAssertAll() {
        softAssertions.assertAll();
    }
}
