package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = {"src/test/resources/features"},
                 glue = {"stepdefinitions"},
                 plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"},
                 tags = "@TutorialsNinjaLogin or @TutorialsNinjaSearchProduct and not @TutorialsNinjaRegister "
                 
		        )

public class MyRunner_TestNG extends AbstractTestNGCucumberTests{

}
