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
		features = "classpath:Features/person-repository2.feature",
		glue={"com.damienfremont.blog"}
)
public class BDDRunner2 {

}