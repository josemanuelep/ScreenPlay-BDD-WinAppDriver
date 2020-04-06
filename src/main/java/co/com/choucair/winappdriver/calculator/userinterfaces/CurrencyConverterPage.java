package co.com.choucair.winappdriver.calculator.userinterfaces;

import co.com.choucair.winappdriver.calculator.utils.WinAppDriver;
import io.appium.java_client.windows.WindowsElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CurrencyConverterPage {
    private CurrencyConverterPage() {
    }

    public static final Target BUTTON_REFRESH_RATES = Target.the("Button to refresh currency  rates").located(By.xpath("//*[@AutomationId='CurrencyRefreshBlock']"));
    public static final Target COMBOBOX_INPUT_CURRENCY = Target.the("Result of conversion").located(By.xpath("//*[@AutomationId='Units1']"));
    public static final Target COMBOBOX_OUTPUT_CURRENCY = Target.the("Result of conversion").located(By.xpath("//*[@AutomationId='Units2']"));
    public static final Target RESULT_OF_CONVERSION = Target.the("Result of conversion").located(By.xpath("//*[@AutomationId='Value2']"));
    public static final Target INPUT_OF_CONVERSION = Target.the("Input of conversion").located(By.xpath("//*[@AutomationId='Value1']"));

    public static Target getTargetByName(String name){
       return Target.the("Bottun of currency").located(By.xpath("//*[@Name='"+name+"']"));
    }
}
