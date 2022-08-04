package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectItemFromDropDownDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	getTitleDemo();
		getURLDemo();
	}
	public static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\ExapleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	    Thread.sleep(3000);
		oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
		oBrowser.get("D:\\JavaScript/Sample.html");
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	private static void getTitleDemo()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title = (String)js.executeScript("var kk=document.title;return kk");
		System.out.println("Title:"+title);
	}
	private static void getURLDemo()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String )js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL:"+url);
	}
	private static void getLinkCount()
	{
		JavascriptExecutor js=( JavascriptExecutor) oBrowser;
		js.executeScript("var kk=document.get");
	}
}
