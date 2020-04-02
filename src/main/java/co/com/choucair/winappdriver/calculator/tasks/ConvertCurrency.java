package co.com.choucair.winappdriver.calculator.tasks;

import io.appium.java_client.windows.WindowsElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.BUTTON_INPUT_CURRENCY;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.INPUT_OF_CONVERSION;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

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
                SelectFromOptions.byValue("Europa Euro").from(BUTTON_INPUT_CURRENCY),
                Enter.theValue(mount.toString()).into(INPUT_OF_CONVERSION)
        );
    }
}
