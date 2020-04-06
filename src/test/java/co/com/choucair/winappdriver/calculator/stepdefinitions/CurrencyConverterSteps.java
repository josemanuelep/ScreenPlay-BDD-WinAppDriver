package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.interactions.SelectCurrency;
import co.com.choucair.winappdriver.calculator.questions.IsCurrency;
import co.com.choucair.winappdriver.calculator.tasks.ConvertCurrency;
import co.com.choucair.winappdriver.calculator.tasks.OpenCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CurrencyConverterSteps {
    private String actor = "Jose";

    @Given("^Jose goes to currency calculator$")
    public void joseGoesToCurrencyCalculator() {
        theActorCalled(actor).wasAbleTo(OpenCalculator.currencyConverter());
    }


    @Given("^He set currency \"([^\"]*)\" and \"([^\"]*)\"$")
    public void heSetCurrencyAnd(String arg1, String arg2) {
        theActorCalled(actor).wasAbleTo(SelectCurrency.of(arg1, arg2));
    }

    @When("^He input (\\d+)$")
    public void heInput(int arg1) {
//        theActorCalled(actor).attemptsTo(ConvertCurrency.set(arg1));
    }

    @Then("^He should see the convert curency (\\d+)$")
    public void heShouldSeeTheConvertCurency(Double arg1) {
//        theActorInTheSpotlight().should(seeThat(IsCurrency.correct(arg1)));
    }

}
