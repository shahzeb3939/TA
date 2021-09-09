package com.TA.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io/login"));
    }

    @When("user adds {word} and {word} to login field")
    public void whenUserLogins(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(email).into("//input[@name='email']"),
                Enter.keyValues(password).into("//input[@name='password']"),
                Click.on("//button[.//span[.='Sign in']]")
        );
    }

    @Then("user should see that he is logged in")
    public void userLoggedIn() {

    }
}
