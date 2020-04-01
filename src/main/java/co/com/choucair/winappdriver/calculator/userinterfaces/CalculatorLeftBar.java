package co.com.choucair.winappdriver.calculator.userinterfaces;

import io.appium.java_client.windows.WindowsElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorLeftBar {

    public static final Target BUTTON_TOGGLE_LEFT_PANE = Target.the("Button to all funtons in calculator").located(By.xpath("//*[@AutomationId='TogglePaneButton']"));
    public static final Target BUTTON_STANDART_CALCULATOR = Target.the("Button to standart calculator").located(By.xpath("//*[@AutomationId='Standard']"));

}

