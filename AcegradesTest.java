package com.infofactors.acegrades.tests;

import com.infofactors.acegrades.Acegrades;

public class AcegradesTest extends Acegrades
{
	
	public static void main(String[] args) throws InterruptedException
	{
		String res,res1;
		boolean result,result1;
		
		Acegrades ace=new Acegrades();
		res=ace.LaunchApp();
		System.out.println("Launch Application Successful -> "+res);
		
		
		
		result=ace.TeacherLogin(loguname, logpwd);
		System.out.println("Teacher Login Successfull -> "+result);
		if (result)
		{
			System.out.println("Teacher Login Test :Pass");
			
		} else 
		{
			System.out.println("Teacher Login Test : Fail");

		}
	
		
		ace.closeApp();
		System.out.println("Application Closed Successfully");
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		res1=ace.LaunchApp1();
		System.out.println("Launch Application Successfull -> "+res1);
		
		result1=ace.ParentLogin(logpuname, logppwd);
		System.out.println("Parent Login Successfull ->"+result1);
		if (result1)
		{
			System.out.println("Parent Login Test : Pass");
			
		} else
		{
			System.out.println("Parent Login Test : Fail");

		}
		
		ace.closeApp1();
		System.out.println("Application Closed Successfully");

	}
}
