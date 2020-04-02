package co.com.choucair.winappdriver.calculator.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CurrencyConverterPage {
    private CurrencyConverterPage() {
    }
    public static final Target BUTTON_REFRESH_RATES = Target.the("Button to refresh currency  rates").located(By.xpath("//*[@AutomationId='CurrencyRefreshBlock']"));
    public static final Target BUTTON_CLEAR = Target.the("Button to refresh currency  rates").located(By.xpath("//*[@AutomationId='CurrencyRefreshBlock']"));
    public static final Target BUTTON_INPUT_CURRENCY = Target.the("Selected to change input currency").located(By.xpath("//*[@AutomationId='Units1']"));
    public static final Target BUTTON_OUTPUT_CURRENCY = Target.the("Selected to change output currency").located(By.xpath("//*[@AutomationId='Units2']"));
    public static final Target RESULT_OF_CONVERSION = Target.the("Result of conversion").located(By.xpath("//*[@AutomationId='Value2']"));
    public static final Target INPUT_OF_CONVERSION = Target.the("Input of conversion").located(By.xpath("//*[@AutomationId='Value1']"));

}
