package com.rsm.Test;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.rsm.PO.RSMLoginPage;

public class TC_Login extends BaseClass {
	
private static String url = "https://portal-surovin-dev.azurewebsites.net/Welcome";
	
	@Test
	public void Login() throws InterruptedException, IOException {
		
		driver.get(RSMUrl);
		logger.info("RSM Base URL opened");
		
		RSMLoginPage rlp = new RSMLoginPage(driver);
		
		try{
			
			if(rlp.labelLogin()){
				
				rlp.clickOnLogin1();
				logger.info("Login button clicked");
				
			}
			
		}catch(NoSuchElementException e){
			
			captureScreen(driver,"RSM Login");
			logger.info("Something wrong with landing page!");
			AssertJUnit.assertTrue(false);
			
		}
		
		rlp.setEmail(email);
		logger.info("Email added");
		rlp.setPassword(password);
		logger.info("Password added");
		rlp.clickonLogin2();
		logger.info("Login button clicked");
		
		if(driver.getCurrentUrl().contains(url) && rlp.btnHome()){
			
			AssertJUnit.assertTrue(true);
			logger.info("Login success!");
			
		}else{
			
			captureScreen(driver,"RSM Login");
			logger.info("Login failed!");
			AssertJUnit.assertTrue(false);
			
		}
		
	}

}
