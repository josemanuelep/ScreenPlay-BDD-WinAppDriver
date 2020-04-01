package co.com.choucair.winappdriver.calculator.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.CALCULATOR_RESULT;

public class IsOperation implements Question<Boolean> {
    private Integer result;

    public IsOperation(Integer result) {
        this.result = result;
    }

    public static IsOperation correct(Integer result) {
        return new IsOperation(result);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String toValidate = Text.of(CALCULATOR_RESULT).viewedBy(actor).asString().replaceAll("\\D+","");;
        return this.result.equals(Integer.valueOf(toValidate));
    }
}
