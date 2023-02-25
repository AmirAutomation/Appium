package runner;

import io.cucumber.junit.CucumberOptions;
import tests.TestBase;

@CucumberOptions(
        features = "src/test/resources/features/CreateTasksExample.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
public class TestRunner extends TestBase {
}
