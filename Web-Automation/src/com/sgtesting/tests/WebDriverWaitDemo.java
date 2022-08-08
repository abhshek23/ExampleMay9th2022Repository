package com.sgtesting.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
launchBrowser();
navigate();
login();

	}
static void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
	oBrowser=new ChromeDriver();
	
}
static void navigate()
{
	try
	{
		oBrowser.navigate().to("http://localhost/login.do");
		WebDriverWait  wait=new WebDriverWait(oBrowser, Duration.ofSeconds(30)); 
		WebElement oEle=oBrowser.findElement(By.id("username"));
		wait.until(ExpectedConditions.attributeContains(oEle, "name","username"));
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		String val=oBrowser.findElement(By.id("username")).getAttribute("placeholder");
		System.out.println(val);
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		String val1=oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).getText();
		System.out.println(val1);
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(oBrowser,Duration.ofSeconds(50));
		WebElement oEle=oBrowser.findElement(By.id("SubmitTTButton"));
		wait.until(ExpectedConditions.attributeContains(oEle, "id","SubmitTTButton"));
		
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}
}
