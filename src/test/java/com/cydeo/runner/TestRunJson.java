package com.cydeo.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber-json-report.json",
        features="src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,
        tags="@Test"
)
public class TestRunJson {

}