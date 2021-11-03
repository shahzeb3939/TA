package com.TA.app.login.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Login {

    public static Task using(String email, String password) {
        return Task.where("{0} tries to login",
                Enter.keyValues(email).into("//input[@name='email']"),
                Enter.keyValues(password).into("//input[@name='password']"),
                Click.on("//button[.//span[.='Sign in']]")
        );
    }
}
