package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;
import com.mystore.utilities.Action2;

public class LoginPage {

@FindBy(xpath="//input[@id='email']")
WebElement emailAddressBox;

@FindBy(xpath="//input[@id='passwd']")
WebElement passwordBox;

@FindBy(xpath="//*[@id='email_create']")
WebElement emailForNewAccount;

@FindBy(name="SubmitLogin")
WebElement signinBtn;

@FindBy(xpath="//button[@id='SubmitCreate']")
WebElement createAccBtn;
	
Action2 action2= Action2.getAction2();

static WebDriver Idriver;

public LoginPage() {}

public LoginPage(WebDriver rdriver) {
	this.Idriver= rdriver;
	PageFactory.initElements(Idriver, this);//initialising all the elements in this page
	
}



public static String getLoginPageURL()
{
	
	return BaseClass.driver.getCurrentUrl(); 
}
}

