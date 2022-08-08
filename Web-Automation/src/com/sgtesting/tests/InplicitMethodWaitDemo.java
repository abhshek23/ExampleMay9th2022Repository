package com.sgtesting.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InplicitMethodWaitDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	launchbrowser();
	navigate();

	}
  static void launchbrowser()
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
		  oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
