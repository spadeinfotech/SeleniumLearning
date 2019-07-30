package com.spade.tescases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class LoginTest {
	

	public static WebDriver driver=null;
	WebElement element=null;
	


	  @BeforeTest
	  public void Openbrowser() {
		    
		  System.setProperty("webdriver.chrome.driver", "C:\\Ankit-WorkArea\\SeleniumWorkSpace\\seleniumlearning\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://192.168.11.125:8039/MotorInsuranceApp/#/Login");
		  System.out.println();
		    
	  }

	  
	  @AfterTest
	  public void closebrowser() throws InterruptedException {
		
		  Thread.sleep(5000);
		//  driver.quit();
		 
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
	 // Assert.assertEquals(Actualurl, expectedurl, "title mismatch");
	  	  
	  System.out.println("title matched");

	  //alternate way to compare
	  if(Actualurl.equals(expectedurl)) {
	  	
	  }else {
	  	
	  }  
	  

  }
  @Test(priority=4)
  public void verify_registration() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  Thread.sleep(4000);
	  driver.findElement(By.id("Registration-link")).click();
	  Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@value='New']")).click();
	 //element= driver.findElement(By.xpath("//span[@aria-owns='AccidentTypeDropDown_listbox']"));
	 
      Thread.sleep(2000);
      //driver.findElement(By.id("Insured_Id")).sendKeys("1111");
      driver.findElement(By.xpath("//span[@aria-owns='AccidentTypeDropDown_listbox']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//ul[@id='AccidentTypeDropDown_listbox']/li[4]")).click();
      driver.findElement(By.id("POLICY_NUMBER")).sendKeys("P/102/06/5011/2016/500/459");
      driver.findElement(By.id("sequenceId")).sendKeys("585273010");
      driver.findElement(By.xpath("//span[@aria-owns='AccidentTypeDropDown_listbox']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@id='AccidentTypeDropDown_listbox']/li[2]")).click();
      driver.findElement(By.id("ACCIDENT_DATE")).sendKeys("05/09/2017");
      driver.findElement(By.xpath("//input[@value='Create']")).click();
      
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//u[text()='Policy Details']"))));
      
      
       // Accident Data tab
      
       driver.findElement(By.xpath("//b[text()='Accident Data']")).click();
      Thread.sleep(5000);
    
      driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[4]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='July 2019']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-w'])[5]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-w'])[5]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[contains(.,'Sep')]")).click();
      Thread.sleep(2000);
      //driver.findElement(By.xpath("//a[contains(.,'18')]")).click();
      Thread.sleep(2000);
      //driver.findElement(By.xpath("//input[@class='']")).click();

      driver.findElement(By.xpath("//span[text()='Select Accident City']")).click();
      Thread.sleep(2000);
     element= driver.findElement(By.xpath("(//input[contains(@class,'k-textbox')])[71]"));
     wait.until(ExpectedConditions.visibilityOf(element));
     element.sendKeys("ABHA");
     Thread.sleep(2000);
     element.sendKeys(Keys.ENTER);
      driver.findElement(By.id("CLAIMANT_NAME")).sendKeys("anit");
      
//Accident City      Code 1 
      // driver.findElement(By.xpath("//span[@aria-owns='accCityDropDown_listbox']")).click();
   // Thread.sleep(2000);
   // driver.findElement(By.xpath("//ul[@id='accCityDropDown_listbox']/li[2]")).click();
      
      //Accident City      Code 2 
     
    //  WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-owns='accCityDropDown_listbox']")));
    //  element1.click();

    
 	// element= driver.findElement(By.id("AccidentTypeDropDown"));   
	//Select Accidentype=new Select(element);
	//Accidentype.selectByIndex(2);
	  
      //how to select value from dropdown
/*
      element=driver.findElement(By.name("birthday_day"));
      Select day=new Select(element);
      day.selectByIndex(2);*/
      
  }

}
