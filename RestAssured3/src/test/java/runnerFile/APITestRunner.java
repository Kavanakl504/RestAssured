package runnerFile;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import java.io.File;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.internal.support.FileReader;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"resources/features"},
		glue= {"crud"},
		plugin= {"pretty","html:target/cucumber-html-reports.html","json:target/cucumber.json"},
		monochrome=true
		
		)
public class APITestRunner {
	
	@AfterClass
	public static void writeReport()
	{
		
	}

}
