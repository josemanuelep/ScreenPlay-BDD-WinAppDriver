package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.tasks.Divide;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class DivideSteps {
    private String actor = "Jose";

    @Given("^He divide (\\d+) divided (\\d+)$")
    public void heDivideDivided(int arg1, int arg2) {
        OnStage.theActorCalled(actor).wasAbleTo(Divide.numbers(arg1, arg2));
    }


}
