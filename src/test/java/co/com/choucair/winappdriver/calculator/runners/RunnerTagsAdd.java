package co.com.choucair.winappdriver.calculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/standart_calculator/add.feature",
        glue = {"co.com.choucair.winappdriver.calculator.stepdefinitions","co.com.choucair.winappdriver.calculator.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTagsAdd {
}
