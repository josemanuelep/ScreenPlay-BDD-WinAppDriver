package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.questions.IsOperation;
import co.com.choucair.winappdriver.calculator.tasks.Add;
import co.com.choucair.winappdriver.calculator.tasks.OpenCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddSteps {
    private String actor = "Jose";

    @Given("^Jose goes to standart calculator$")
    public void joseGoesToStandartCalculator() {
        OnStage.theActorCalled(actor).wasAbleTo(OpenCalculator.standart());
    }

    @Given("^He plus (\\d+) and (\\d+)$")
    public void hePlusAnd(int arg1, int arg2) {
        OnStage.theActorCalled(actor).wasAbleTo(Add.numbers(arg1, arg2));

    }

    @Then("^He should see the total (\\d+)$")
    public void heShouldSeeTheTotal(int arg1) {
        theActorInTheSpotlight().should(seeThat(IsOperation.correct(arg1)));
    }
}
