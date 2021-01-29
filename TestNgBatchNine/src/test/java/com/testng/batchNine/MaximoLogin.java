package com.testng.batchNine;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.Tools;

public class MaximoLogin {
//	@BeforeMethod
//	void BatchNineMaximoLogin(){
//		System.setProperty("webdriver.chrome.driver", "C:\\Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://maximo-demo76.mro.com/maximo/webclient/login/login.jsp?welcome=true");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("maximo");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("maximo1");
//		
//		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
//		
//	}
	
	@Test(enabled=false)
	static void MaximoCreateLocation() throws Throwable{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://maximo-demo76.mro.com/maximo/webclient/login/login.jsp?welcome=true");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("maximo");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("maximo1");
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		driver.findElement(By.xpath("//*[@id='titlebar-tb_gotoButton']")).click();	
		driver.findElement(By.xpath("//*[@id='menu0_ASSET_MODULE_a']")).click();
		driver.findElement(By.xpath("//*[@id='menu0_ASSET_MODULE_sub_changeapp_LOCATION_a']")).click();
		
		driver.findElement(By.xpath("//*[@id='toolactions_INSERT-tbb_image']")).click();
		
		String abc = Tools.generateUniqueNumber(10);
		driver.findElement(By.xpath("//*[@id='m8ee1358-tb']")).sendKeys(abc);
		driver.findElement(By.xpath("//*[@id='m8ee1358-tb2']")).sendKeys("This is for automation testing");
		
		driver.findElement(By.xpath("//*[@id='m91e742e2-img']")).click();
		driver.findElement(By.xpath("//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:3]']")).click();
		driver.findElement(By.xpath("//*[@id='toolactions_SAVE-tbb_image']")).click();
		
		WebElement savedMsg = driver.findElement(By.xpath("//*[contains(text(),'Record has been saved')]"));
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(savedMsg));
		
		String message = "Record has been saved";
		
		if (driver.getPageSource().contains(message)) {
			System.out.println(message + " text is present");
		} else {
			System.out.println(message + " text is absent");
		}
		
		String actual = driver.findElement(By.xpath("//*[contains(text(),'Record has been saved')]")).getText();
		String expected = "Recorsald has been saved";
		Assert.assertTrue(actual.contains(expected));
		
		
		
	}
	
	@Test(enabled=false)
	static void MaximoCreateAsset(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://maximo-demo76.mro.com/maximo/webclient/login/login.jsp?welcome=true");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("maximo");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("maximo1");
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		driver.findElement(By.xpath("//*[@id='titlebar-tb_gotoButton']")).click();
		driver.findElement(By.xpath("//*[@id='menu0_ASSET_MODULE_a']")).click();
		driver.findElement(By.xpath("//*[@id='menu0_ASSET_MODULE_sub_changeapp_ASSET_a_tnode']")).click();
	}
	
	@Test
	static void uploadFileSelenium(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		
		uploadBtn.sendKeys("C:\\Upload\\SeleniumUpload.txt");
		
		driver.findElement(By.xpath("//*[@class='field_check']")).click();
		
		driver.findElement(By.xpath("//*[@id='submitbutton']")).click();
		
//		String actual = driver.findElement(By.xpath("//*[contains(text(),'Record has been saved')]")).getText();
//		String expected = "Recorsald has been saved";
//		Assert.assertTrue(actual.contains(expected));
		
		
		
		
		
	}

}
