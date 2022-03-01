package pom.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	public void setUserName(String uname) throws InterruptedException
	{
	
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) throws InterruptedException
	{
		
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		loginBtn.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
}
