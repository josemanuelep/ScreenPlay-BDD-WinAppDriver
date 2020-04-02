package co.com.choucair.winappdriver.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenCalculator implements Task {
    public static OpenCalculator standart() {
        return Tasks.instrumented(OpenCalculator.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
