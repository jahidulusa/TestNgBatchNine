package com.testng.batchNine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TrialClass {
	
	
	//declaration and instantiation of objects/variables

    String key = "webdriver.chrome.driver";
    String value = "C:\\Driver\\chromedriver.exe";

    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://www.google.com";

@BeforeSuite

    public void setUp() {   
        
    System.setProperty(key,value);  
    driver = new ChromeDriver();
    }

@Test

    public void verifyhomepage_title(){

    driver.get(baseUrl);
    String expectedtitle = "Welcome: Mercury Tours";
    String actualtitle = driver.getTitle();
    Assert.assertEquals(actualtitle,expectedtitle);
    driver.quit();
}

}
