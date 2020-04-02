package co.com.choucair.winappdriver.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.COMBOBOX_INPUT_CURRENCY;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.INPUT_OF_CONVERSION;

public class ConvertCurrency implements Task {
    private Integer mount;

    public ConvertCurrency(int mount) {
        this.mount = mount;
    }

    public static ConvertCurrency set(int arg1) {
        return Tasks.instrumented(ConvertCurrency.class, arg1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(mount.toString()).into(INPUT_OF_CONVERSION)

        );
    }
}
