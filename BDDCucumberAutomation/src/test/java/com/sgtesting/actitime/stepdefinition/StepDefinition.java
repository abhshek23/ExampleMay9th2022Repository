package com.sgtesting.actitime.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver oBrowser=null;
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I navigate the Application url$")
	public void i_navigate_the_Application_url()  
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the username in username text field$")
	public void i_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the password in password text field$")
	public void i_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on login button$")
	public void i_click_on_login_button() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}


	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on minimize flyout window$")
	public void i_click_on_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Given("^I Click create user$")
	public void I_Click_create_user()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	      Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I Click Add user$")
	public void I_Click_Add_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			 Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then ("^I find create User page$")
	public void I_find_create_User_page()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_sectionHeaderPlaceholder\"]"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When ("^I Enter First name in firstName text field$")
	public void I_Enter_First_name_in_firstName_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I Enter Last Name in lastName text field$")
	public void I_Enter_Last_Name_in_lastName_text_field()
	{
		try
		{
	oBrowser.findElement(By.name("lastName")).sendKeys("user1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
@And("^I Enter Email in email Text field$")
public void I_Enter_Email_in_email_Text_field()
{
	try
	{
		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
@And("^I Enter uername in username Text field$")
public void I_Enter_uername_in_username_Text_field()
{
	try
	{
		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
		Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
@And("^I Enter Password in password Text field$")
public void I_Enter_Password_in_password_Text_field()
{
	try
	{
		oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
@And ("^I Enter  Password in RetypepassWord Field$")
public void I_Enter_Password_in_RetypepassWord_Field()
{
	try
	{
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
@And ("^I click Add user$")
public void I_click_Add_user()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		Thread.sleep(3000);		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@Given("^I Select User$")
public void I_Select_User()
{
try
{
	oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
	 Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
	
}


/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@And("^I Modify the Username$")
public void I_Modify_the_Username()
{
	try
	{
		oBrowser.findElement(By.name("username")).sendKeys("Abhi1");
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}


/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */

@Then("^I Find the save changes option$")
public void I_Find_the_save_changes_option()
{
	try
	{
	
	WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Save Changes']"));
	Assert.assertTrue(oEle.isDisplayed());
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}


/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@When("^I save the changes$")
public void I_save_the_changes()
{
	try
	{
	
	 oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	 Thread.sleep(2000);
	}
catch(Exception e)
{
	e.printStackTrace();
}
}



/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@Then("^I Find the Delete button$")
public void I_Find_the_Delete_button()
{
	WebElement oEle=null;
	try
	{
		oEle=oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]"));
		Assert.assertTrue(oEle.isDisplayed());
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}


/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@When("^I Click Delete button$")
public void I_Click_Delete_button()
{
	try
	{
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		 Thread.sleep(5000);	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@And("^I Deleted completely$")
public void I_Deleted_completely()
{
try
{
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
/**
 * Author:
 * Created Date:
 * Reviewed By:
 * Reviewed Date:
 * Parameters:
 * Return value:
 * Purpose:
 * Description:
 */
@Then("^I find the home page$")
public void I_find_the_home_page()
{
	WebElement oEle=null;
	try
	{
	oEle=oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a"));
	Assert.assertTrue(oEle.isDisplayed());
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page() 
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I close Application$")
	public void I_close_Application() 
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

}
