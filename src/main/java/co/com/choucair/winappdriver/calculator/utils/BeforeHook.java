package co.com.choucair.winappdriver.calculator.utils;

import cucumber.api.java.Before;
import io.appium.java_client.windows.WindowsDriver;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BeforeHook {
    @Before
    public void prepareStage() {
        WinAppDriver.open();
        OnStage.setTheStage(new OnlineCast());
    }
}
