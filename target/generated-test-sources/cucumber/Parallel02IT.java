import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Mathson/eclipse-workspace/automation-practice/src/test/resources/features/email_verification.feature"},
        plugin = {"html:C:/Users/Mathson/eclipse-workspace/automation-practice/target/cucumber-parallel/2"},
        monochrome = true,
        tags = {"~@ignored"},
        glue = {"com.testingpractice.steps"})
public class Parallel02IT {
}
