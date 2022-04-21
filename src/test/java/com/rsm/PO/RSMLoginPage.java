package com.rsm.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSMLoginPage {
	
WebDriver ldriver;
	
	public RSMLoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/a[1]")
	@CacheLookup
	WebElement labelLogin;
	
	@FindBy(xpath="//body/div[1]/div[1]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//input[@id='Input_Email']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Input_Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/nav/section/a[1]")
	@CacheLookup
	WebElement btnHome;
	
	public boolean labelLogin() throws InterruptedException {
		return labelLogin.isDisplayed();
	}
	
	public void clickOnLogin1() throws InterruptedException {
		labelLogin.click();
	}
	
	public boolean btnLogin() throws InterruptedException {
		return btnLogin.isDisplayed();
	}
	
	public void setEmail(String email) throws InterruptedException {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) throws InterruptedException {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickonLogin2() throws InterruptedException {
		btnLogin.click();
		//Thread.sleep(10000);
	}
	
	public boolean btnHome() throws InterruptedException {
		return btnHome.isDisplayed();
	}

}
