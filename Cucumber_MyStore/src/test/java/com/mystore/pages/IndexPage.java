package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import com.mystore.utilities.Action2;


public class IndexPage  {
	
	Action2 action2= Action2.getAction2();
	
	private WebDriver Idriver;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signinbtn;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(id="search_query_top")
	WebElement searchProductBox;
	
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	WebElement searchButton;
	
	
	
	public IndexPage(WebDriver rdriver) {
		this.Idriver= rdriver;
		PageFactory.initElements(Idriver, this);//initialising all the elements in this page
		
	}
	
	
	//validation methods
	
	public LoginPage clickOnSignIn() throws Throwable {
		
		
		action2.fluentWait(Idriver, signinbtn, 10);
		action2.scrollByVisibilityOfElement(Idriver, signinbtn);
		action2.click(Idriver, signinbtn);//Instead of using click directly here...we are just calling methods in actions class
		
		return new LoginPage(Idriver);
	}
	
	public boolean ValidateLogo() {
		
		
		return action2.isDisplayed(Idriver, logo);
	}
	public String getMyStoreTitle() {
		return action2.getTitle(Idriver);
	}
	
}
