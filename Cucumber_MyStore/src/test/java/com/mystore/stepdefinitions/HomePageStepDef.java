package com.mystore.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mystore.base.BaseClass;
import com.mystore.pages.IndexPage;
import com.mystore.pages.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDef {
	
	
	private IndexPage indexpage;
	private LoginPage loginpage;
	
	@Given("User is in Index page")
	public void user_is_in_index_page() {
		indexpage = new IndexPage(BaseClass.driver);
	}

	@When("User clicks the signin Button in Index page")
	public void user_clicks_the_signin_button_in_index_page() {
	    
		 try {
			loginpage = indexpage.clickOnSignIn();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Then("User is navigated to {string}")
	public void user_is_navigated_to(String url) {
	    String expurl= url;
	    Assert.assertEquals(expurl, LoginPage.getLoginPageURL());
	    
		
	}



}
