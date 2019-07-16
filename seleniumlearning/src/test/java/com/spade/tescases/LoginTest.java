package com.spade.tescases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class LoginTest {
	

	public static WebDriver driver=null;
	

	  @BeforeTest
	  public void Openbrowser() {
		    
		  System.setProperty("webdriver.chrome.driver", "C:\\Ankit-WorkArea\\SeleniumWorkSpace\\seleniumlearning\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("http://192.168.11.125:8039/MotorInsuranceApp/#/Login");
		    
	  }

	  
	  @AfterTest
	  public void closebrowser() {
		 // driver.quit();
		 
	  }

	
	
	
  @Test
  public void loginintotheApplication() {
	  
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys("aa");
	  driver.findElement(By.id("Password")).clear();
	  driver.findElement(By.id("Password")).sendKeys("aa");
	  driver.findElement(By.id("loginButtonid")).click();
	  
	  
  }
  
  @Test
  public void verify_homepagetitle() {
	  
	  
	  
  }
  @Test
  public void verify_Homepageurl() {
	  
	  
	  
  }


}
