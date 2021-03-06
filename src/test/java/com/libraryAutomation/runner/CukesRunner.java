package com.libraryAutomation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
         //right click cucumber report open in browser chrome
        features = "src/test/resources/features",
        glue = "com/libraryAutomation/StepDefinitions",
        dryRun = false,
        tags = "@student or @librarian"


)




public class CukesRunner {


}
