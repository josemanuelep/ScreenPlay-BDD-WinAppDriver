package co.com.choucair.winappdriver.calculator.tasks;

import co.com.choucair.winappdriver.calculator.interactions.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.*;

public class Multiply implements Task {
    private Integer num1;
    private Integer num2;

    public Multiply(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static Multiply numbers(Integer num1, Integer num2) {
        return Tasks.instrumented(Multiply.class, num1, num2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOn.number(this.num1),
                Click.on(BUTTON_MULTIPLY),
                ClickOn.number(this.num2),
                Click.on(BUTTON_EQUAL)
        );
    }
}
