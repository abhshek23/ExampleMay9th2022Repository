package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	
	public static void main(String[] args) {
	
		launchBrowser();
		navigate();
		closeApplication();
	}
	public static WebDriver oBrowser=null;
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExapleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(5000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
