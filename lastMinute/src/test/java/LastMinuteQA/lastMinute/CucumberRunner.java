package LastMinuteQA.lastMinute;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/LastMinuteQA/lastMinute", plugin = {"pretty", "html:target/cucumber"},tags= "@smokeTest")

public class CucumberRunner {
}

