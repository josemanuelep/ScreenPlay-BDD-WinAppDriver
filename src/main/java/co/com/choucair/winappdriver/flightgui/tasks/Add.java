package co.com.choucair.winappdriver.flightgui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Add implements Task {
    private Integer num1;
    private Integer num2;

    public Add(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
