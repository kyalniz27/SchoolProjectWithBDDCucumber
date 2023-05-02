package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"stepDefinition"},
        //plugin = {"pretty", "html:json-report/cucumber.html"},
        //plugin = {"pretty", "json:target/json-report/cucumber.json"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        monochrome = true,
        tags = "@active"
        )

public class RunnerClass {
}
