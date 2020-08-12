package com.Bitrix24.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features",
        "json:target/json-report.json",
                "rerun:target/rerun.txt"

        },
        glue = "com/Bitrix24/StepDefinitions",
        dryRun = false,
        plugin = "html:target/cucumber-report.html"




)

public class CukesRunner {


}
