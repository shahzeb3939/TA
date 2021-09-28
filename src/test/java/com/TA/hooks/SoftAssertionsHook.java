package com.TA.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.assertj.core.api.SoftAssertions;

public class SoftAssertionsHook {

    public static SoftAssertions softAssertions;

    @Before(order = 2)
    public void beforeSoftAssertion() {
        softAssertions = new SoftAssertions();
    }

    @After
    public void afterSoftAssertion() {
        softAssertions.assertAll();
    }
}
