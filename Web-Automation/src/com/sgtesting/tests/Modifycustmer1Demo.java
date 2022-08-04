package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modifycustmer1Demo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer1();
        modifyCustomer();
        DeleteCustomer1();
       logOut();
        closeApplication();
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
		 oBrowser.findElement(By.id("logoutLink")).click();
		 Thread.sleep(5000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void CreateCustomer1()
 {
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
		 Thread.sleep(3000);
		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
		 Thread.sleep(3000);
		 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		 Thread.sleep(3000);
		 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Facebook");
		
		 oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
		 Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
private static void modifyCustomer()
{
	try
	{
	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Connect peoples");
	 Thread.sleep(3000);
	 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")).click();
	 Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 private static void DeleteCustomer1()
 {
	 try
	 {
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		 Thread.sleep(3000);
		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		 Thread.sleep(5000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}
