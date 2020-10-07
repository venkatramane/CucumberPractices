package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\VENKATRAMAN\\workspace\\DataProviderCucumberMAp\\src\\main\\java\\featuresfi\\sign.feature",
		glue={"stepdef"},
//		monochrome=true,
		strict=true,
		dryRun=false
		)


public class TestRunner {

}
