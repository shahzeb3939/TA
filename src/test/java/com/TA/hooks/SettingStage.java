package com.TA.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import  net.serenitybdd.screenplay.actors.OnlineCast;

public class SettingStage {

    @Before(order = 1)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Max");
    }
}
