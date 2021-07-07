package com.bookit.runners;

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

   features= "src/test/resources/features",
   glue= "com/bookit/step_definitions",
        dryRun = false,
       tags="@Test"
        //for parallel testing comment tags part and double click test in maven

)





public class CukesRunner {

}
