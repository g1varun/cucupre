package com.damienfremont.blog;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {


		@Given("^an empty repository$") 
		public static void an_empty_repository(){
		Assert.assertEquals(1, 0);
		}
		
		@When("^I create a new Person named$")
		public static void I_create_a_new_Person_named(){
			Assert.assertEquals(1, 0);
			}
		
		
		@Then("^I should have Person named$")
		public static void I_should_have_Person_named(){
			System.out.println("I should have Person named");
			}
		
		
		@Given("^a repository$")
		public static void a_repository(){
			System.out.println("a repository");
			}
		
}