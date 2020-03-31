package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CaculatorPage {
    private CaculatorPage() {
    }

    public static final Target BUTTON_ADD = Target.the("Button to add").located(By.xpath("//*[@AutomationId='equalButton']"));
    public static final Target BUTTON_EQUAL = Target.the("Button to add").located(By.xpath("//*[@AutomationId='plusButton']"));
}
