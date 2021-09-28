package com.TA.steps;

import com.TA.hooks.SoftAssertion;
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
import org.testng.asserts.SoftAssert;

import java.util.function.Consumer;

import static com.TA.app.login.user_interfaces.LoginPageUI.ADMIN_IN_USERS_GRID;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginSteps {

    SoftAssertions softAssertions = SoftAssertion.softAssertions;

    private String email;

    @Given("user is on login page")
    public void userIsOnLoginPage() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io/login"));
//        Thread.sleep(5000);
    }

    @When("user adds {word} and {word} to login field")
    public void whenUserLogins(String email, String password) {
        this.email = email;
//        Assert.assertEquals(1, 4);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(1, 4);
//        softAssert.assertAll();
//        SoftAssertions.assertSoftly(new Consumer<SoftAssertions>() {
//            @Override
//            public void accept(SoftAssertions softAssertions) {
//                Assert.assertEquals(1, 4);
//            }
//        });
//        SoftAssertions softAssertions = new SoftAssertions();
//        softAssertions.assertThat(1).isEqualTo(4);
//        softAssertions.assertAll();

//        softAssertions.assertThat(1).isEqualTo(4);

        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(email).into("//input[@name='email']"),
                Enter.keyValues(password).into("//input[@name='password']"),
                Click.on("//button[.//span[.='Sign in']]")
        );
    }

    @Then("user should see that he is logged in")
    public void userLoggedIn() {
        softAssertions.assertThat("hehe").isEqualTo("hehe");
//        softAssertions.assertThat("not").isEqualTo("nowt");
//        Assert.assertEquals(1, 4);
        theActorInTheSpotlight().should(
//                seeThat(the("//span[.='ztna.automation@gmail.com']"), isPresent())
//                seeThat(the("//span[.='ztna.automation@gmail.com']"), containsText(email))
//                seeThat(the("//tr[contains(@id, 'en-ztna-TableRow')][.//td[contains(@id, 'RowCell-role')][.='Admin']]//td[contains(@id, 'RowCell-email')]//span"), containsText(email))
//                seeThat(the(ADMIN_IN_USERS_GRID), containsText(email))
                seeThat(the(ADMIN_IN_USERS_GRID.of(email)), isPresent())
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(1).isEqualTo(1)
        );
    }
}
