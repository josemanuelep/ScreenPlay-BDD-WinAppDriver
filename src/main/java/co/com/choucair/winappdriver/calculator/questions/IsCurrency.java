package co.com.choucair.winappdriver.calculator.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.CALCULATOR_RESULT;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverterPage.RESULT_OF_CONVERSION;

public class IsCurrency implements Question<Boolean> {
    private Double result;

    public IsCurrency(Double result) {
        this.result = result;
    }

    public static IsCurrency correct(Double result) {
        return new IsCurrency(result);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String toValidate = Text.of(RESULT_OF_CONVERSION).viewedBy(actor).asString().replaceAll("\\D+", "");
        System.out.println("Result " + toValidate);
        return this.result.equals(Integer.valueOf(toValidate));
    }
}
