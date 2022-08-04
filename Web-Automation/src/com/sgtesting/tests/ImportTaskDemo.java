package com.sgtesting.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTaskDemo
{
public static WebDriver oBrowser =null;
	public static void main(String[] args) {
	launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	importtask();

	}
 private static void launchBrowser()
 {
	 try
	 {
	 System.setProperty("webdriver.chrome.driver","D:\\ExapleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
	 oBrowser= new ChromeDriver();
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void navigate()
 {
	 try
	 {
		 oBrowser.navigate().to("http://localhost/login.do");
		 oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 Thread.sleep(3000);
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
	 Thread.sleep(2000);
	 Robot robot=new Robot();
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void minimizeFlyOutWindow()
 {
	try
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
 }
 private static void importtask()
 {
	 try
	 {
		 oBrowser.findElement(By.xpath(" //*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath(" //*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
		oBrowser.findElement(By.xpath("//div[@class='item importTasks ellipsis']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[@id='dropzoneClickableArea']")).click();
		String filename="D:\\Samplecsv\\Sample.csv";
		copyFile(filename);
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\"loadTasksFromCSVPopup_commitBtn\"]/div/span")).click();
		Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 
 private static void copyFile(String filepath)
 {
	StringSelection stringselection=new StringSelection(filepath);
//	Toolkit.getDefaultToolkit().getSystemClipboard().getContents(stringselection,null);
	Toolkit toolkit=Toolkit.getDefaultToolkit();
	Clipboard clipboard=toolkit.getSystemClipboard();
	clipboard.setContents(stringselection, null);	 
 }

}

 