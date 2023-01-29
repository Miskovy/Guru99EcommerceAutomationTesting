package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"}, // your feature file path
        glue = {"org.example.StepDefs"}, // package name which contains package of step definition classes

        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt",},

        tags = "@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
