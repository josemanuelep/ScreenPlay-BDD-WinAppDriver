package co.com.choucair.winappdriver.flightgui.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsAdd implements Question<Boolean> {
    private Integer result;

    public IsAdd(Integer result) {
        this.result = result;
    }
    public static IsAdd correct(Integer result) {
        return new IsAdd(result);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
