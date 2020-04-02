package co.com.choucair.winappdriver.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.BUTTON_CLEAR;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CalculatorLeftBar.*;

public class OpenCalculator implements Task {
    private static String funtion;
    public static OpenCalculator standart() {
        funtion = "standart";
        return Tasks.instrumented(OpenCalculator.class);
    }

    public static OpenCalculator currencyConverter() {
        funtion = "currency";
        return Tasks.instrumented(OpenCalculator.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      switch (funtion){
          case "standart":
              actor.attemptsTo(
                      Click.on(BUTTON_TOGGLE_LEFT_PANE),
                      Click.on(BUTTON_STANDART_CALCULATOR),
                      Click.on(BUTTON_CLEAR)
              );
          case "currency":
              actor.attemptsTo(
                      Click.on(BUTTON_TOGGLE_LEFT_PANE),
                      Click.on(BUTTON_CURRENCY_CALCULATOR),
                      Click.on(BUTTON_CLEAR)
              );
      }
    }
}
