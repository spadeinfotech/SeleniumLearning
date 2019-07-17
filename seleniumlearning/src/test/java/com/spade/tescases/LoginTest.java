package com.spade.tescases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class LoginTest {
	

	public static WebDriver driver=null;
	

	  @BeforeTest
	  public void Openbrowser() {
		    
		  System.setProperty("webdriver.chrome.driver", "C:\\Ankit-WorkArea\\SeleniumWorkSpace\\seleniumlearning\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  driver.get("http://192.168.11.125:8039/MotorInsuranceApp/#/Login");
		  System.out.println();
		    
	  }

	  
	  @AfterTest
	  public void closebrowser() throws InterruptedException {
		
		  Thread.sleep(5000);
		  driver.quit();
		 
	  }

	
	
	
  @Test(priority=1)
  public void loginintotheApplication() {
	  
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys("aa");
	  driver.findElement(By.id("Password")).clear();
	  driver.findElement(By.id("Password")).sendKeys("aa");
	  driver.findElement(By.id("loginButtonid")).click();
	  
	  
  }
  
  @Test(priority=2)
  public void  verify_homepagetitle() {
	String Actualtitle=  driver.getTitle();
	String expected="Motor Claim";
	  
//Assert.assertEquals(Actualtitle, expected);
Assert.assertEquals(Actualtitle, expected, "title mismatch");
	  
System.out.println("title matched");

if(Actualtitle.equals(expected)) {
	System.out.println("matched");
}else {
	System.out.println("Not matched");
	
}
 }
 
  
  @Test(priority=3)
  public void verify_Homepageurl() throws InterruptedException {

	  Thread.sleep(2000);
	  
	  //explicit wait
	//  WebDriverWait wait=new WebDriverWait(driver, 2);
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homepage")));
	  
      String Actualurl=driver.getCurrentUrl();

	  String expectedurl="http://192.168.11.125:8039/MotorInsuranceApp/#/Home";
	//Assert.assertEquals(Actualtitle, expected);
	  Assert.assertEquals(Actualurl, expectedurl, "title mismatch");
	  	  
	  System.out.println("title matched");

	  //alternate way to compare
	  if(Actualurl.equals(expectedurl)) {
	  	
	  }else {
	  	
	  }  
	  
	  
  }


}
