package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.tasks.ConvertCurrency;
import co.com.choucair.winappdriver.calculator.tasks.OpenCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CurrencyConverterSteps {
    private String actor = "Jose";

    @Given("^Jose goes to currency calculator$")
    public void joseGoesToCurrencyCalculator() {
        theActorCalled(actor).wasAbleTo(OpenCalculator.currencyConverter());
    }

    @Given("^He set currency Estados Unidos Dolar and Nueva Zelanda Dolar$")
    public void heSetCurrencyEstadosUnidosDolarAndNuevaZelandaDolar() {
//        theActorCalled(actor).wasAbleTo(ConvertCurrency.);
    }

    @When("^He input (\\d+)$")
    public void heInput(int arg1) {
        theActorCalled(actor).attemptsTo(ConvertCurrency.set(arg1));
    }

    @Then("^He should see the convert curency (\\d+)$")
    public void heShouldSeeTheConvertCurency(int arg1) {

    }

}
