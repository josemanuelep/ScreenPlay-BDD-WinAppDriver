package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CaculatorPage {
    private CaculatorPage() {
    }
    public static final Target BUTTON_ADD = Target.the("Button to add").located(By.xpath("//*[@AutomationId='equalButton']"));
    public static final Target BUTTON_EQUAL = Target.the("Button to equal").located(By.xpath("//*[@AutomationId='plusButton']"));
    public static final Target CALCULATOR_RESULT = Target.the("Input result").located(By.xpath("//*[@AutomationId='CalculatorResults']"));
    public static final Target BUTTON_1 = Target.the("Input result").located(By.name("Uno"));
    public static final Target BUTTON_2 = Target.the("Input result").located(By.name("Dos"));
    public static final Target BUTTON_3 = Target.the("Input result").located(By.name("Tres"));
    public static final Target BUTTON_4 = Target.the("Input result").located(By.name("Cuatro"));
    public static final Target BUTTON_5 = Target.the("Input result").located(By.name("Cinco"));
    public static final Target BUTTON_6 = Target.the("Input result").located(By.name("Seis"));
    public static final Target BUTTON_7 = Target.the("Input result").located(By.name("Siete"));
    public static final Target BUTTON_8 = Target.the("Input result").located(By.name("Ocho"));
    public static final Target BUTTON_9 = Target.the("Input result").located(By.name("Nueve"));
    public static final Target BUTTON_0 = Target.the("Input result").located(By.name("Cero"));
}
