package com.rsm.Test;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.rsm.PO.RSMPermitsPage;

public class TC_Permits extends BaseClass {
	
	//private static String url = "https://portal-surovin-dev.azurewebsites.net/Welcome";
	private static String compName = "RT";
	private static String materialName = "";
	
	@Test(priority = 1)
	public void rsmPermits() throws InterruptedException, IOException {
		
		TC_MultiUsersLogin login = new TC_MultiUsersLogin();
		
		login.rsmLogin(email, password);
		
		RSMPermitsPage permits = new RSMPermitsPage(driver);
		
		permits.clickOnPermits();
		logger.info("Permits tab clicked");
		
		permits.checkAllowEveryone();
		logger.info("Allow Everyone radio button clicked");
		
		permits.checkAllowCategories();
		logger.info("Allow Categories radio button clicked");
		
		permits.checkRMSupplier();
		logger.info("RMSupplier checkbox clicked");
		
		permits.checkRMCustomer();
		logger.info("RMCustomer checkbox clicked");
		
		permits.checkAllowCompanies();
		logger.info("Allow Companies radio button clicked");
		
		permits.setCompanyName(compName);
		logger.info("Company name enterd");
		
		permits.clickOnSearch();
		logger.info("Search button clicked");
		
		String status = permits.getStatus();
		logger.info("Button Status : "+status);
		
		if(status.contains("Dovoli")){
			
			permits.clickOnAllow();
			logger.info("Allow button clicked");
			
		}else{
			logger.info("Already granted the permission");
		}
		
		permits.clickOnSave();
		logger.info("Save button clicked");
		
		permits.clickOnMyRawMaterials();
		logger.info("My raw materials button clicked");
		
		try{
			
			if(permits.labelRawMaterial()){
				
				logger.info("Raw Material found");
				
				materialName = permits.getMaterialName();
				logger.info("Material name saved.. "+materialName);
				
			}
			
			}catch(NoSuchElementException e){
				captureScreen(driver,"RSM Permits - My raw materials");
				logger.info("Materials not available!");
				AssertJUnit.assertTrue(false);
			}
		
		permits.clickOnLogout();
		logger.info("Logout button clicked");

	}
	
	@Test(priority = 2)
	public void rsmCheckPermission() throws InterruptedException, IOException {
		
		TC_MultiUsersLogin login = new TC_MultiUsersLogin();
		
		login.rsmLogin(email2, password2);
		
		RSMPermitsPage permits = new RSMPermitsPage(driver);
		
		permits.clickOnSearchTab();
		logger.info("Search tab clicked");
		
		permits.setMaterialName(materialName);
		logger.info("Material name enterd");
		
		permits.clickOnResourceSearch();
		logger.info("ResourceSearch button clicked");
		
		try{
			
			if(permits.labelMaterial()){
				
				logger.info("Material found. Permission granted!");
				
			}
			
			}catch(NoSuchElementException e){
				captureScreen(driver,"RSM Permits - Search");
				logger.info("Something wrong. Searched material is not available!");
				AssertJUnit.assertTrue(false);
			}

	}

}
