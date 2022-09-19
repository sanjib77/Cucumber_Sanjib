package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"E:\\EclpseWorkspace1\\CucumberDemo\\src\\test\\resources\\Features"},
glue= {"StepDefinition"})
public class testRunner {
	
	

}
