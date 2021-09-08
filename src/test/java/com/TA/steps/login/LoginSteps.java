package com.TA.steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {
    private String userName;
    private String password;

    @Given("user is on login page")
    public void onLoginPage() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io"));
    }

    @When("user adds {word} and {word} to login")
    public void userLogins(String userName, String password) {
        this.userName = userName;
        this.password = password;
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(userName).into("#en-ztna-loginForm-emailInput"),
                Enter.keyValues(password).into("#en-ztna-loginForm-passwordInput")
//                Click.on("#en-ztna-loginForm-signInButton")
        );
    }

    @Then("user should see that he is logged in")
    public void userIsLoggedIn() {
        System.out.println(userName);
        System.out.println(password);
    }
}
