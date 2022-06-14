package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumberFeatures",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})
public class TestRunner {
}

