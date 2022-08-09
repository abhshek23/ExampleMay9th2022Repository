package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		naviagate();
       mouseActions();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			Thread.sleep(3000);
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void naviagate()
	{
		try
		{
		oBrowser.navigate().to("https://www.icicibank.com/");
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void mouseActions()
	{
		try
		{
			Actions oMouse=new Actions(oBrowser);
			WebElement oEle=oBrowser.findElement(By.cssSelector("a#loginsection"));
			// WebElement oEle=oBrowser.findElement(By.xpath("//a[@id='loginsection']"));
			 oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(3000);
			oBrowser.findElement(By.linkText("Corporate Banking")).click();
			Thread.sleep(3000);
			oBrowser.navigate().back();
			Thread.sleep(2000);
			WebElement oEle1=oBrowser.findElement(By.cssSelector("a#loginsection"));
			Thread.sleep(5000);
			oMouse.contextClick(oEle1).build().perform();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
