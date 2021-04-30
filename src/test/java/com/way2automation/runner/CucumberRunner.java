package com.way2automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

        "pretty",
        "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "com/way2automation/step_definitions",
        dryRun = false,
        publish =true,
        tags = "@delete_user"



        )

public class CucumberRunner {
}
