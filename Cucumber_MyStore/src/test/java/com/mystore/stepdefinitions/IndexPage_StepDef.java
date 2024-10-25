package com.mystore.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mystore.base.BaseClass;
import com.mystore.pages.IndexPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IndexPage_StepDef  {
	
	public WebDriver driver;
	public IndexPage indexpage;
	//private BaseClass bc= new BaseClass();
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("launching browser");
		indexpage = new IndexPage(BaseClass.driver);
			}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		System.out.println("opening url " +url);
	   BaseClass.driver.get(url);
	    
	}

	@Then("Page Logo should be shown")
	public void page_logo_should_be_shown() {
	    Assert.assertTrue(indexpage.ValidateLogo());
	}

	@Then("Page title is equal to {string}")
	public void page_title_is_equal_to(String exptitle) {
	    String acttitle=indexpage.getMyStoreTitle();
	    Assert.assertEquals(acttitle, exptitle);
	}

	@Then("Close browser")
	public void close_browser() {
	    
	}

}
