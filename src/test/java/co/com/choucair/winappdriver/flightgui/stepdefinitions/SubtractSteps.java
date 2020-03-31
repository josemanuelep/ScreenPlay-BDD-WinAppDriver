package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.questions.IsOperation;
import co.com.choucair.winappdriver.flightgui.tasks.Subtract;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SubtractSteps {

    @Given("^He subtract (\\d+) minus (\\d+)$")
    public void heSubtractMinus(int arg1, int arg2) {
        OnStage.theActorCalled("Jose").wasAbleTo(Subtract.numbers(arg1,arg2));
    }

    @Then("^He should see the total -(\\d+)$")
    public void heShouldSeeTheTotal(int arg1) {
        theActorInTheSpotlight().should(seeThat(IsOperation.correct(arg1)));
    }

}
