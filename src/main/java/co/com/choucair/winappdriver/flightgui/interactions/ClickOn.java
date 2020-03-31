package co.com.choucair.winappdriver.flightgui.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.CaculatorPage.*;

public class ClickOn implements Interaction {
    private Integer num1;
    private Integer num2;

    public ClickOn(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static ClickOn numbers(Integer num1, Integer num2) {
        return new ClickOn(num1, num2);
    }

    private Interaction clickNumber(Integer num) {
        switch (num) {
            case 1:
                return Click.on(BUTTON_1);
            case 2:
                return Click.on(BUTTON_2);
            case 3:
                return Click.on(BUTTON_3);
            case 4:
                return Click.on(BUTTON_4);
            case 5:
                return Click.on(BUTTON_5);
            case 6:
                return Click.on(BUTTON_6);
            case 7:
                return Click.on(BUTTON_7);
            case 8:
                return Click.on(BUTTON_8);
            case 9:
                return Click.on(BUTTON_9);
            case 0:
                return Click.on(BUTTON_0);
        }
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                clickNumber(this.num1),
                Click.on(BUTTON_ADD),
                clickNumber(this.num2),
                Click.on(BUTTON_EQUAL)
        );
    }
}
