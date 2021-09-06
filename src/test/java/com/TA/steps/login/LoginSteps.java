package com.TA.steps.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {
    List<Map<String, String>> testData;

    @Given("user is on login page")
    public void onLoginPage() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io"));
    }

    @When("user logins using following credentials")
    public void userLogins(DataTable dataTable) {
        testData = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : testData)
            theActorInTheSpotlight().attemptsTo(
                    Enter.keyValues(data.get("userName")).into("#en-ztna-loginForm-emailInput"),
                    Enter.keyValues(data.get("password")).into("#en-ztna-loginForm-passwordInput"),
                    Click.on("#en-ztna-loginForm-signInButton")
            );
    }

    @Then("user should be logged in")
    public void userIsLoggedIn() {
        System.out.println("In then step");
        for (Map<String, String> data : testData)
            System.out.println(data.get("userName")+" "+data.get("password"));
    }
}
