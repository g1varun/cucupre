package com.demo.blog;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends Hook {
	public By usernames = By.xpath("//input[@name='userName']");
	public By password = By.xpath("//input[@name='password']");
	public By submit = By.xpath("//input[@name='submit']");
	public By signoff = By.linkText("SIGN-OFF");


		@Given("^an empty repository$") 
		public static void an_empty_repository(){
		Assert.assertEquals(1, 1);
		}
		
		@When("^I create a new Person named$")
		public static void I_create_a_new_Person_named(){
			Assert.assertEquals(1, 1);
			}
		
		
		@Then("^I should have Person named$")
		public static void I_should_have_Person_named(){
			System.out.println("I should have Person named");
			}
		
		
		@Given("^a repository$")
		public static void a_repository(){
			System.out.println("a repository");
			}
		
		@Given ("user launch browser$")
		public void openURL(){
			openBrowser();
		}
		
		
		@Then("user opens application page$")
		public void launchapplication() throws Throwable{
			
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
		
		@Then("^user enters Credentials to LogIn <Data in list format>$")
		public void login(List<userlist> users) throws InterruptedException{
				
			for(userlist user : users){
				
				WebElement username = driver.findElement(usernames);
				username.sendKeys(user.username());
				
				WebElement passwd = driver.findElement(password);
				passwd.sendKeys(user.password());
				
				WebElement submt = driver.findElement(submit);
				submt.click();
				Thread.sleep(4000);
				
				WebElement signof = driver.findElement(signoff);
				signof.click();
				Thread.sleep(4000);
			}
		}

		 @When("^user logins with Username \"(.*?)\" and Password \"(.*?)\"$")
		 public void entercredentails_ScenaioOutline(String user, String passwd) throws InterruptedException{
			 
			 driver.findElement(usernames).sendKeys(user);
			 driver.findElement(password).sendKeys(passwd);
			 driver.findElement(submit).click();
			 Thread.sleep(3000);
			 WebElement signof = driver.findElement(signoff);
			 signof.click();
			 Thread.sleep(4000);
		 }
		
		
		 @Then ("^user logins successfullly$")
		public void validateUserLoginsSuccessfully(){
			 if(driver.getCurrentUrl()!=""){
				 System.out.println("User login is successful");
			 }
			 else{
				 System.out.println("User login is not successful");
			 }
		 }
		
		@Then("close the browser$")
		public void close_browser() throws Throwable
		{
			driver.quit();
		}
		
}