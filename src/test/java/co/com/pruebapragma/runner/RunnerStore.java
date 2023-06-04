package co.com.pruebapragma.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/store.feature",
        glue = {"co.com.pruebapragma.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@Escenario4-AgregarMonitores"
)


public class RunnerStore {
}
