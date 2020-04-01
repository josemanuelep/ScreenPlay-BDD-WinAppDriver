package co.com.choucair.winappdriver.flightgui.tasks;

import co.com.choucair.winappdriver.flightgui.interactions.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.CaculatorPage.*;

public class Divide implements Task {
    private Integer num1;
    private Integer num2;

    public Divide(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static Divide numbers(Integer num1, Integer num2) {
        return Tasks.instrumented(Divide.class, num1, num2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOn.number(this.num1),
                Click.on(BUTTON_DIVIDE),
                ClickOn.number(this.num2),
                Click.on(BUTTON_EQUAL)
        );
    }
}
