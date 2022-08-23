package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/saied rahman/workspace/FreeCrmBDDFramework/src/test/java/Features"
		,glue= {"stepDefinitions"}
		)





public class TestRunner {

}
