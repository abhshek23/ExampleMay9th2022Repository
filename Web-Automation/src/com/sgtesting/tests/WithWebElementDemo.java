package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {
   public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();

	}
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
	private static void login()
	{
		try
		{
			WebElement oText=oBrowser.findElement(By.id("username"));
			oText.sendKeys("DemoUser1");
			Thread.sleep(2000);
			oText.clear();
			Thread.sleep(2000);
			oText.sendKeys("DemoUser12");
			Thread.sleep(2000);
			oText.clear();
			Thread.sleep(2000);
			oText.sendKeys("DemoUser3");
			Thread.sleep(2000);
			oText.clear();
			Thread.sleep(2000);
			oText.sendKeys("DemoUser1234");
			Thread.sleep(2000);
			String val=oText.getAttribute("value");
			System.out.println(val);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
