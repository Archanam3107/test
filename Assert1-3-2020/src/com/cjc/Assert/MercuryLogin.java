package com.cjc.Assert;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MercuryLogin 
{
public WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		System.out.println("open browser");
	}
	
	           
	@BeforeTest
	public void openurl()
	{
	
		driver.get("http://newtours.demoaut.com/");
	   System.out.println("open url ");
	}
	
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
		System.out.println("maximize the page");
	}
	@BeforeMethod
	public void getcookies()
	{
		 Set<Cookie> se=driver.manage().getCookies();
		 int count=se.size();
		 System.out.println("total no of cookies:"+count);
		 
	}
	//hardassert
	public void titlepage()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Welcome:Mercury Tours");
	}
	
	

 @Test()
  public void registerpage() 
 {    
	
	
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manjusha1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manjusha");
		driver.findElement(By.xpath("//input[@name='login']")).click();
				System.out.println("successfuly login");
		
				
				//Softassert
		//SoftAssert sf=new SoftAssert();
		String title1=driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals(title1, "Find a Flight:Mercury Tours:");
		
		           //register page
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		//passenger
		WebElement val=driver.findElement(By.xpath("//select[@name='passCount']"));
		 Select sel=new Select(val);
		 sel.selectByIndex(1);
		//Departing from 
		 WebElement val1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		 Select sel1=new Select(val1);
		 sel1.selectByIndex(1);
	
         //on
		 WebElement val2=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		 Select sel2=new Select(val2);
		 sel2.selectByIndex(3);
         
		 WebElement val3=driver.findElement(By.xpath("//select[@name='fromDay']"));
		 Select sel3=new Select(val3);
		 sel3.selectByIndex(3);
		 
		 //Arraving 
		 WebElement val4=driver.findElement(By.xpath("//select[@name='toPort']"));
		 Select sel4=new Select(val4);
		 sel4.selectByIndex(3);

		//returning
		 WebElement val5=driver.findElement(By.xpath("toMonth"));
		 Select sel5=new Select(val5);
		 sel5.selectByIndex(4);
		 //on
		 WebElement val6=driver.findElement(By.xpath("//select[@name='toDay']"));
		 Select sel6=new Select(val6);
		 sel6.selectByIndex(2);
		 //service
		 driver.findElement(By.xpath("//input[@name='servClass']")).click();
		 //airline
		 WebElement val7=driver.findElement(By.xpath("//select[@name='airline']"));
		 Select sel7=new Select(val7);
		 sel7.selectByIndex(2);
		 
		 //continue
		 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
        //sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		System.out.println("successfuly register");

  }
	@AfterMethod
	public void cscreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src,new File("H:\\screenshot\\fbt.jpg"));
		  System.out.println("capture screenshot");
	}

	@AfterClass
	public void deletecookie()
	{
		driver.manage().deleteAllCookies();
		System.out.println("delete cookies");
	}
	@AfterTest
	public void db()
	{
		System.out.println("db close");
	}
	@AfterSuite
	public void closewindow()
	{
		driver.close();
		System.out.println("close browser");
	}
	  
	
	
	
	
  }
