package co.com.choucair.winappdriver.calculator.utils;

import cucumber.api.java.Before;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppSesion {
    private static WindowsDriver CalculatorSession = null;
//    @BeforeClass
    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            CalculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }
//    @Before
    public void Clear()
    {
        CalculatorSession.findElementByXPath("//*[@Name='Quitar entrada']");
    }

}
