package com.cydeo.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {"html:target/cucumber_report.html","json:target/cucumber-json-report.json",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber", "rerun:target/rerun.txt"},
            features = "src/test/resources/features" ,
            glue = "com/cydeo/step_definitions",
            dryRun=false,
            tags = "@qwe"

    ) public class CukesRunner {}
