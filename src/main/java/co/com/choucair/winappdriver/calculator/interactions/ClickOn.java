package co.com.choucair.winappdriver.calculator.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.*;

public class ClickOn implements Interaction {
    private Integer num1;

    public ClickOn(Integer num1) {
        this.num1 = num1;
    }

    public static ClickOn number(Integer num1) {
        return new ClickOn(num1);
    }

    private Interaction switchNumber(Integer num) {
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
        int numbersOfDigits = this.num1.toString().length();
        String numAsString = this.num1.toString();
        if (numbersOfDigits==1){
            actor.attemptsTo(
                   switchNumber(this.num1)
            );
        }else{
            for (int i = 0; i < numbersOfDigits; i++) {
                int digit = Character.getNumericValue(numAsString.charAt(i));
                actor.attemptsTo(
                        switchNumber(digit)

                );
            }
        }

    }
}
