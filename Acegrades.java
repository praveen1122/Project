package com.infofactors.acegrades;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Acegrades
{
	
	public static WebDriver driver;
	public static String url="http://acegrades.com";
	public static String loguname="shaik12@infofactors.net";
	public static String logpwd="123456";
	public static String logpuname="shaik21@infofactors.net";
	public static String logppwd="123456";
	
	
	public String LaunchApp()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Browser_Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\Selenium_Browser_Drivers\\IEDriverServer.exe");
		driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		//driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		if (driver.findElement(By.linkText("HOME")).isDisplayed()) 
		{
		    return "Pass";
		}
		else 
		{
		   return "Fail";
            
		}
	}
	
	public boolean TeacherLogin(String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.linkText("LOG IN")).click();
	    driver.findElement(By.id("email")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.id("loginId")).click();
	    Thread.sleep(5);
	    driver.findElement(By.partialLinkText("Shaik Prav")).click();
	    driver.findElement(By.id("logoutId")).click();
	    
	    if (driver.findElement(By.id("loginId")).isDisplayed()) 
	    {
	    	return true;
			
		} else 
		{
			return false;

		}
	}
	
	public void closeApp()
	{
		driver.close();
	}
	
	public String LaunchApp1()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		if (driver.findElement(By.linkText("HOME")).isDisplayed()) 
		{
		    return "Pass";
		}
		else 
		{
		   return "Fail";
            
		}
	}
	
	public boolean ParentLogin(String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("loginId")).click();
		Thread.sleep(5);
		driver.findElement(By.partialLinkText("Fayaz Hu")).click();
		driver.findElement(By.xpath("//header/div/div/ul/li[2]/a")).click();
		
		if (driver.findElement(By.id("loginId")).isDisplayed()) 
		{
			return true;
			
		} else
		{
			return false;

		}
	}
	  
	public void closeApp1()
	{
		driver.close();
	}

}
