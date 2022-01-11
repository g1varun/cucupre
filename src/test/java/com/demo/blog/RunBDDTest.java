package com.demo.blog;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	 
		format = { "pretty", "json:target/cucumber.json" }, 
/*		format = { "pretty", "html:target/cucumberReports/payment/", 
			      "json:target/cucumberReports/payment/report.json", 
			      "junit:target/cucumberReports/payment/junit.xml" }, */
		features = "classpath:Features/person-repository.feature",
		glue={"com.damienfremont.blog"}
)
public class RunBDDTest {
/*	
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		
		GenrateCucumberReport.genrateCucumberReport();
		testNGCucumberRunner.finish();
	}*/
}