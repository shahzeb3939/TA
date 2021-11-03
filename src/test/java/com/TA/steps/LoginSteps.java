package com.TA.steps;

import com.TA.app.login.tasks.Login;
import com.TA.hooks.SoftAssertionsHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginSteps {
    String email;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io/login"));
    }

    @When("user adds {word} and {word} to login field")
    public void whenUserLogins(String email, String password) {
        this.email = email;
        theActorInTheSpotlight().attemptsTo(Login.using(email, password));
    }

    @Then("user should see that he is logged in")
    public void userLoggedIn() {
        theActorInTheSpotlight().should(
                seeThat(the("//tr[contains(@id, 'en-ztna-TableRow')][.//td[contains(@id, 'RowCell-role-1')][.='Admin']]//td[contains(@id, 'RowCell-email')]//span"), containsText(email))
        );
    }
}
