package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/shoestock.feature",
        glue = {"steps"},
        monochrome = false
)
public class CtsWeb {
}
