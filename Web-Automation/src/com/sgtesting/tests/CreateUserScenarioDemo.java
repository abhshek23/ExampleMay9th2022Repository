package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenarioDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		//logOut();
		//closeApplication();
		

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
		 Thread.sleep(5000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void createUser()
 {
	 try
	 {
	 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	 Thread.sleep(2000);
	 oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
	 Thread.sleep(2000);
	 oBrowser.findElement(By.name("firstName")).sendKeys("demo");
	 oBrowser.findElement(By.name("lastName")).sendKeys("user1");
	 oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
	 oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
	 oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
	 oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
	 Thread.sleep(3000);
	 oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	 Thread.sleep(3000);
	 
 }catch (Exception e)
	 {
	 e.printStackTrace();
	 }
 }
 private static void deleteUser()
 {
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(5000);
		 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		 Thread.sleep(5000);
		 Alert oAlert=oBrowser.switchTo().alert();
		 String content=oAlert.getText();
		 System.out.println(content);
		 oAlert.accept();
		 Thread.sleep(5000);
		 
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }

}
