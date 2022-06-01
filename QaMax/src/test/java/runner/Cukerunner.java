package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sethi\\eclipse-workspace\\QaMax\\Feature"
		,glue="stepdefinitons"
		,tags="@Login"		
)  

public class Cukerunner {

  	  	
}
