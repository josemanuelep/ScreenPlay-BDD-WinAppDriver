package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.questions.IsOperation;
import co.com.choucair.winappdriver.calculator.tasks.Subtract;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SubtractSteps {
    private String actor ="Jose";
    @Given("^He subtract (\\d+) minus (\\d+)$")
    public void heSubtractMinus(int arg1, int arg2) {
        OnStage.theActorCalled(actor).wasAbleTo(Subtract.numbers(arg1,arg2));
    }


}
