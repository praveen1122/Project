package com.acegrades.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUp 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://acegrades.com");
		driver.findElement(By.linkText("SIGNUP")).click();
		
		List<WebElement> links;
		links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links Are -> "+links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String linkname=links.get(i).getText();
			System.out.println(linkname);
			
		}
		driver.close();
 	}

}
