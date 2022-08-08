package com.sgtesting.tests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Wait<WebDriver> wait=new FluentWait<WebDriver>(oBrowser)
			                       .withTimeout(Duration.ofSeconds(30))
			                       .pollingEvery(Duration.ofSeconds(2))
			                       .ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
