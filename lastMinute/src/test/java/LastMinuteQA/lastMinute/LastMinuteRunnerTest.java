package LastMinuteQA.lastMinute;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/LastMinuteQA/lastMinute/ButtonModify.feature", 
				 plugin = {"pretty", "html:target/LastMinuteQAReport"})


public class LastMinuteRunnerTest {
}

