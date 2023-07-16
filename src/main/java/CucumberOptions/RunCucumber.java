package CucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resouces/tiki.feature",
        glue = "stepDefinitionl",
        tags = "@smokeTest and @regressionTest",
        publish = true,
        monochrome = true,
        plugin = {
                "junit:target/reports/cucumber.xml",
                "json:target/reports/CucumberTestReport.json",
                "html:target/reports/cucumber-pretty",
                "rerun:target/reports/rerun.txt"
        }
)

public class RunCucumber {
        private TestNGCucumberRunner testNGCucumberRunner;
        @BeforeClass(alwaysRun = true)
        public void setUpClass() {
                testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
                System.out.println("This is steps : setUpClass");
        }
        @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
        public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
                testNGCucumberRunner.runScenario(pickle.getPickle());
                System.out.println("This is steps : scenario");
        }
        @DataProvider
        public Object[][] scenarios() {
                System.out.println("This is steps : DataProvider");
                return testNGCucumberRunner.provideScenarios();

        }
        @AfterClass(alwaysRun = true)
        public void tearDownClass() {
                testNGCucumberRunner.finish();
                System.out.println("This is steps : tearDownClass");
        }
}
