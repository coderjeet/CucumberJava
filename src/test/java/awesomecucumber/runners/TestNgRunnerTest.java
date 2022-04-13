package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        features = "src/test/java/features",
        tags="",
        glue= {"awesomecucumber.stepdefinations", "awesomecucumber.hooks","awesomecucumber.customtype",
                "awesomecucumber.domainobjects","awesomecucumber.context"})
 public class TestNgRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
      return super.scenarios();
    }

 }
