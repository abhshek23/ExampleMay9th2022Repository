package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogOutChromeDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
	//	logOut();

		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExapleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
		Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void closeApplication()
   {
	   try
	   {
		   oBrowser.quit();  
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
     private static void login()
     {
	    try
	    {
		 oBrowser.findElement(By.id("username")).sendKeys("admin");
		 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		 oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		 Thread.sleep(5000);
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
     } 
     private static void minimizeFlyOutWindow()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();; 
    		 Thread.sleep(2000);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     private static void logOut()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.id("Logout")).click();
    		 Thread.sleep(200);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
