package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/amazonSignInTest.feature", glue = "StepDefinations", monochrome = true,dryRun=false)
public class testRunner extends AbstractTestNGCucumberTests {

}
