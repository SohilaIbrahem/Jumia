package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = { "StepDefinition" }, monochrome = true, plugin = {
        "pretty", "html:target/HtmlReports/report.html", "json:target/JsonReport/report.json",
        "junit:target/JunitReport/report.xml" }, tags = "@SmokeTest"
//plugin = {"pretty", "json:target/JsonReport/report.json" }
//plugin = {"pretty", "junit:target/JunitReport/report.xml" }
)
public class Runner {

}