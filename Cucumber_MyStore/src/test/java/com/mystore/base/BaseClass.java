package com.mystore.base;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
public class BaseClass {
	

	
	    public static WebDriver driver;

	    @Before
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        System.out.println("In base class- driver initialized");
	        driver.manage().window().maximize();
	        System.out.println("WebDriver initialized: " + driver);
	    }

	    @After
	    public void teardown() {
	        
	            driver.quit();
	            System.out.println("WebDriver initialized: " + driver);
	        
	    }
	}

