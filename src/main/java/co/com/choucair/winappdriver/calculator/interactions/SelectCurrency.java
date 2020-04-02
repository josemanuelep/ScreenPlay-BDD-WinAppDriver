package co.com.choucair.winappdriver.calculator.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.*;

public class SelectCurrency implements Interaction {
    private String currencyIn ;
    private String currencyOut ;

    public SelectCurrency(String currencyIn, String currencyOut) {
        this.currencyIn = currencyIn;
        this.currencyOut = currencyOut;
    }

    public static SelectCurrency of(String currencyIn, String currencyOut){
        return new SelectCurrency(currencyIn,currencyOut);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        COMBOBOX_INPUT_CURRENCY.sendKeys(currencyIn);
        COMBOBOX_OUTPUT_CURRENCY.sendKeys(currencyOut);

    }
}
