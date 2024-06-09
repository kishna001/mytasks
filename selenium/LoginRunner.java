package selenium_programs.seleniumAssignments.Day5Task2andDay6Task1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//features//login.feature",
		glue="stepDef",
		plugin= {"pretty","html:target/Login_Reports"},
		monochrome=true
        )

public class LoginRunner {

}
