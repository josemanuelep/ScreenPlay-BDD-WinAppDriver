package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.questions.IsOperation;
import co.com.choucair.winappdriver.flightgui.tasks.Add;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DivideSteps {

    @Given("^He plus (\\d+) and (\\d+)$")
    public void hePlusAnd(int arg1, int arg2) {
        OnStage.theActorCalled("Jose").wasAbleTo(Add.numbers(arg1,arg2));

    }

    @Then("^He should see the total (\\d+)$")
    public void heShouldSeeTheTotal(int arg1) {
        theActorInTheSpotlight().should(seeThat(IsOperation.correct(arg1)));

    }
}
