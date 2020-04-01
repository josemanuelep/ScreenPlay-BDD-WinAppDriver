package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.questions.IsOperation;
import co.com.choucair.winappdriver.flightgui.tasks.Divide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DivideSteps {


    @Given("^He divide (\\d+) divided (\\d+)$")
    public void heDivideDivided(int arg1, int arg2) {
        OnStage.theActorCalled("Jose").wasAbleTo(Divide.numbers(arg1, arg2));
    }


    @Then("^He should see the result (\\d+)$")
    public void heShouldSeeTheResult(int arg1) {
        theActorInTheSpotlight().should(seeThat(IsOperation.correct(arg1)));
    }
}
