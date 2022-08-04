package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
         frameHandlingDemo();
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void frameHandlingDemo()
{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(5000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(5000);
			WebElement oFrame=oBrowser.findElement(By.className("rightIframe"));
			oBrowser.switchTo().frame(oFrame);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
}
}
}
