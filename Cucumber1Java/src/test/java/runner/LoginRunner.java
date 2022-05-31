package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features/"},
		glue = {"stepdefinitons"},
		plugin = {"pretty"},
		tags = "@Login"
				)

				public class LoginRunner {
	

}