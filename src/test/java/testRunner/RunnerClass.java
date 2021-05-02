package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"stepDefinition"},
        plugin = {"pretty", "html:target/out-put/report.html"},
        dryRun = false,
        monochrome = true,
        tags = "@Student"


)

public class RunnerClass {
}
