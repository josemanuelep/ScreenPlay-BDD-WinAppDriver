package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.questions.IsOperation;
import co.com.choucair.winappdriver.calculator.tasks.Add;
import co.com.choucair.winappdriver.calculator.tasks.Multiply;
import co.com.choucair.winappdriver.calculator.tasks.Subtract;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MultiplySteps {
    private String actor ="Jose";
    @Given("^He multiply (\\d+) and (\\d+)$")
    public void heMultiplyAnd(int arg1, int arg2) {
        OnStage.theActorCalled(actor).wasAbleTo(Multiply.numbers(arg1,arg2));
    }
}
