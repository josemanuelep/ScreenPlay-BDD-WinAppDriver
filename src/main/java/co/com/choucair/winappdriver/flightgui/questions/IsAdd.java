package co.com.choucair.winappdriver.flightgui.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.CaculatorPage.CALCULATOR_RESULT;

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
        String toValidate = Text.of(CALCULATOR_RESULT).viewedBy(actor).asString().replaceAll("\\D+","");;
        return this.result.equals(Integer.valueOf(toValidate));
    }
}
