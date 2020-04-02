package co.com.choucair.winappdriver.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CalculatorLeftBar.BUTTON_STANDART_CALCULATOR;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CalculatorLeftBar.BUTTON_TOGGLE_LEFT_PANE;

public class OpenCalculator implements Task {
    public static OpenCalculator standart() {
        return Tasks.instrumented(OpenCalculator.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_TOGGLE_LEFT_PANE),
                Click.on(BUTTON_STANDART_CALCULATOR)
        );
    }
}
