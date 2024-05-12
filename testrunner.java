package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/LoginPage.feature",
		glue="stepdef",
		dryRun = false ,
		monochrome = true ,
		plugin = {"pretty"}
		)
public class testrunner {

}
