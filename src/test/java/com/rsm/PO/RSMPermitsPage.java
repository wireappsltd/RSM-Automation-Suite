package com.rsm.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSMPermitsPage {
	
WebDriver ldriver;
	
	public RSMPermitsPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/nav[1]/section[1]/a[4]")
	@CacheLookup
	WebElement tabPermits;
	
	@FindBy(xpath="//*[@id=\"permissionForm\"]/div/div[1]/label/../*[@id=\"ResourcePermissionType\"]")
	@CacheLookup
	WebElement radioAllowEveryone;
	
	@FindBy(xpath="//*[@id=\"permissionForm\"]/div/div[2]/label/../*[@id=\"ResourcePermissionType\"]")
	@CacheLookup
	WebElement radioAllowCategories;
	
	@FindBy(xpath="//*[@id=\"categorySelection\"]/div[1]/label/../*[@id=\"CategoryList_0__IsChecked\"]")
	@CacheLookup
	WebElement checkRMSupplier;
	
	@FindBy(xpath="//*[@id=\"categorySelection\"]/div[2]/label/../*[@id=\"CategoryList_1__IsChecked\"]")
	@CacheLookup
	WebElement checkRMCustomer;
	
	@FindBy(xpath="//*[@id=\"permissionForm\"]/div/div[3]/label/../*[@id=\"ResourcePermissionType\"]")
	@CacheLookup
	WebElement radioAllowCompanies;
	
	@FindBy(xpath="//input[@id='txtCompanyName']")
	@CacheLookup
	WebElement txtCompanyName;
	
	@FindBy(xpath="//button[@id='btnCompanySearch']")
	@CacheLookup
	WebElement btnSearch;
	//to do
	@FindBy(xpath="//tbody/tr[2]/td[2]/..//button")
	@CacheLookup
	WebElement btnAllow;
	
	@FindBy(xpath="//*[@id=\"permissionForm\"]/div/div[6]/button")
	@CacheLookup
	WebElement btnSave;
	
	@FindBy(xpath="//body/nav[1]/section[1]/a[3]")
	@CacheLookup
	WebElement tabMyRawMaterials;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement labelRawMaterial;
	
	@FindBy(xpath="//header/div[1]/div[1]/form[1]/button[1]")
	@CacheLookup
	WebElement btnLogout;
	
	@FindBy(xpath="/html/body/nav/section/a[2]")
	@CacheLookup
	WebElement tabSearch;
	
	@FindBy(xpath="//input[@id='grid-last-name']")
	@CacheLookup
	WebElement txtSearch;
	
	@FindBy(xpath="//button[@id='btnResourceSearch']")
	@CacheLookup
	WebElement btnResourceSearch;
	
	@FindBy(xpath="//td[contains(text(),'PGBU')]/..//a[contains(text(),'Quick Sandd')]")
	@CacheLookup
	WebElement labelMaterial;
	
	public boolean tabPermits() throws InterruptedException {
		return tabPermits.isDisplayed();
	}
	
	public void clickOnPermits() throws InterruptedException {
		tabPermits.click();
		Thread.sleep(3000);
	}
	
	public boolean radioAllowEveryone() throws InterruptedException {
		return radioAllowEveryone.isDisplayed();
	}
	
	public void checkAllowEveryone() throws InterruptedException {
		radioAllowEveryone.click();
		Thread.sleep(3000);
	}
	
	public boolean radioAllowCategories() throws InterruptedException {
		return radioAllowCategories.isDisplayed();
	}
	
	public void checkAllowCategories() throws InterruptedException {
		radioAllowCategories.click();
		Thread.sleep(3000);
	}
	
	public void checkRMSupplier() throws InterruptedException {
		checkRMSupplier.click();
		Thread.sleep(1000);
	}
	
	public void checkRMCustomer() throws InterruptedException {
		checkRMCustomer.click();
		Thread.sleep(1000);
	}
	
	public boolean radioAllowCompanies() throws InterruptedException {
		return radioAllowCompanies.isDisplayed();
	}
	
	public void checkAllowCompanies() throws InterruptedException {
		radioAllowCompanies.click();
		Thread.sleep(3000);
	}
	
	public boolean txtCompanyName() throws InterruptedException {
		return txtCompanyName.isDisplayed();
	}
	
	public void setCompanyName(String comName) throws InterruptedException {
		txtCompanyName.clear();
		Thread.sleep(1000);
		txtCompanyName.sendKeys(comName);
		//Thread.sleep(5000);
	}
	
	public void clickOnSearch() throws InterruptedException {
		btnSearch.click();
		Thread.sleep(3000);
	}
	
	public boolean btnAllow() throws InterruptedException {
		return btnAllow.isEnabled();
	}
	
	public String getStatus() throws InterruptedException {
		return btnAllow.getText();
	}
	
	public void clickOnAllow() throws InterruptedException {
		btnAllow.click();
		Thread.sleep(3000);
	}
	
	public void clickOnSave() throws InterruptedException {
		btnSave.click();
		Thread.sleep(3000);
	}
	
	public void clickOnMyRawMaterials() throws InterruptedException {
		tabMyRawMaterials.click();
		Thread.sleep(3000);
	}
	
	public boolean labelRawMaterial() throws InterruptedException {
		return labelRawMaterial.isDisplayed();
	}
	
	public String getMaterialName() throws InterruptedException {
		return labelRawMaterial.getText();
	}
	
	public void clickOnLogout() throws InterruptedException {
		btnLogout.click();
		Thread.sleep(3000);
	}
	
	public void clickOnSearchTab() throws InterruptedException {
		tabSearch.click();
		Thread.sleep(3000);
	}
	
	public void setMaterialName(String meterial) throws InterruptedException {
		txtSearch.clear();
		Thread.sleep(1000);
		txtSearch.sendKeys(meterial);
		//Thread.sleep(5000);
	}
	
	public void clickOnResourceSearch() throws InterruptedException {
		btnResourceSearch.click();
		Thread.sleep(3000);
	}
	
	public boolean labelMaterial() throws InterruptedException {
		return labelMaterial.isDisplayed();
	}

}
