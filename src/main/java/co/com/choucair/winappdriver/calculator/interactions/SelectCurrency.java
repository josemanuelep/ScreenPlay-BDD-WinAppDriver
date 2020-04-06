package co.com.choucair.winappdriver.calculator.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.*;

public class SelectCurrency implements Interaction {
    private String currencyIn;
    private String currencyOut;

    public SelectCurrency(String currencyIn, String currencyOut) {
        this.currencyIn = currencyIn;
        this.currencyOut = currencyOut;
    }

    public static SelectCurrency of(String currencyIn, String currencyOut) {
        return new SelectCurrency(currencyIn, currencyOut);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMBOBOX_INPUT_CURRENCY),
                Scroll.to(CURRENCY_eeuu)
                );
    }
}
